import java.util.ArrayList;
import java.util.Arrays;

public class HorizontalLayout implements ILayoutable {

    private ArrayList<ILayoutable> elements;
    private int width;
    private int height = 0;
    private int column = 0;
    private int line = 0;


    public HorizontalLayout(ILayoutable... elements) {
        this.elements = new ArrayList<ILayoutable>(Arrays.asList(elements));
    }

    @Override
    public void calculate() {

        for (ILayoutable el : elements) {
            el.calculate();
            width += el.getWidth();
            height = Math.max(height, el.getHeight());
            width++;
        }
        width--;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void draw(char[][] result) {

        int offset = 0;
        for (int i = 0; i < elements.size(); i++) {


            elements.get(i).setElementPos(line, column + offset + 1);
            elements.get(i).draw(result);

            offset += elements.get(i).getWidth();

        }
    }

    @Override
    public void setElementPos(int i, int j) {
        line = i;
        column = j;
    }

}
