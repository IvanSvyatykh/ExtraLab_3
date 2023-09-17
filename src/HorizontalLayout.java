import java.util.ArrayList;
import java.util.Arrays;

public class HorizontalLayout implements ILayoutable {

    private ArrayList<ILayoutable> elements;
    private int width;
    private int height = 0;

    public HorizontalLayout(ILayoutable... elements) {
        this.elements = new ArrayList<ILayoutable>(Arrays.asList(elements));
    }

    @Override
    public void calculate() {

        for (ILayoutable el : elements) {
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

    }
}
