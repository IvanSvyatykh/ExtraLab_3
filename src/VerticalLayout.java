import java.util.ArrayList;
import java.util.Arrays;

public class VerticalLayout implements ILayoutable {


    private ArrayList<ILayoutable> elements;
    private int heigth;
    private int width = 0;

    public VerticalLayout(ILayoutable... elements) {

        this.elements = new ArrayList<ILayoutable>(Arrays.asList(elements));

    }

    @Override
    public void calculate() {

        for (ILayoutable el : elements) {
            width = Math.max(width, el.getWidth());
            heigth += el.getHeight();
            heigth++;
        }
        heigth--;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void draw(char[][] result) {

    }
}
