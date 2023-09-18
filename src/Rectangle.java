public class Rectangle implements ILayoutable {

    private ILayoutable element;
    private int width;
    private int height;
    private int column=0;
    private int line=0;


    public Rectangle(ILayoutable element) {

        this.element = element;
    }

    @Override
    public void calculate() {
        element.calculate();
        height = element.getHeight() + 4;
        width = element.getWidth() + 4;
        element.setElementPos(height - 2, width - 2);
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

        int count = 0;
        for (int i = line; i < height; i++) {
            for (int j = column; j < width; j++) {

            }
        }
    }

    @Override
    public void setElementPos(int i, int j) {

        line = i;
        column = j;
    }

}
