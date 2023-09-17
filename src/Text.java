public class Text implements ILayoutable {

    private String text;
    private int width;
    private static final int height = 1;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public void calculate() {
        width = text.length();
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
