import java.util.ArrayList;
import java.util.Arrays;

public class Rectangle implements ILayoutable {

    private ILayoutable element;
    private int width;
    private int heigth;

    public Rectangle(ILayoutable element) {

        this.element = element;
    }

    @Override
    public void calculate() {
        heigth = element.getHeight() + 4;
        width = element.getWidth() + 4;
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

    }
}
