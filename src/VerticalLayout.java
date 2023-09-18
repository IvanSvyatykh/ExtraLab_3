import java.util.ArrayList;
import java.util.Arrays;

public class VerticalLayout implements ILayoutable {


    private ArrayList<ILayoutable> elements;
    private int heigth;
    private int width = 0;
    private int column=0;
    private int line=0;


    public VerticalLayout(ILayoutable... elements) {

        this.elements = new ArrayList<ILayoutable>(Arrays.asList(elements));

    }

    @Override
    public void calculate() {

        for (ILayoutable el : elements) {
            el.calculate();
            width = Math.max(width, el.getWidth());
            heigth += el.getHeight();
            heigth++;
        }
        heigth--;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return heigth;
    }

    @Override
    public void draw(char[][] result) {

        int offset = 0;
        for(int i = 0;i < elements.size();i++){

            elements.get(i).setElementPos(line+2 + offset,column);
            offset+=elements.get(i).getHeight();
            elements.get(i).draw(result);
        }
    }

    @Override
    public void setElementPos(int i, int j) {

        line = i;
        column = j;
    }

}
