public class Text implements ILayoutable {

    private String text;
    private int width;
    private static final int height = 1;
    private int column = 0;
    private int line = 0;

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

        int count = 0;
        for (int i = line; i < line + height; i++) {
            for (int j = column; j < width + column; j++) {
                result[i][j] = text.charAt(count);
                count++;
            }
        }
    }

    @Override
    public void setElementPos(int i, int j , int width ,int height) {

        line = i;
        column = j;
    }
}
