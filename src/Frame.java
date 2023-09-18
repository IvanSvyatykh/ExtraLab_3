
public class Frame implements ILayoutable {
    private String headLine;

    private ILayoutable element;
    private int width;
    private int height;
    private int column = 0;
    private int line = 0;

    public Frame(String headLine, ILayoutable element) {

        this.headLine = headLine;
        this.element = element;
    }

    public void calculate() {
        element.calculate();
        width = Math.max(element.getWidth(), headLine.length());
        width += 4;
        height = element.getHeight();
        height += 4;
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

        int currentHeight = line + height;
        int currentWidth = column + width;
        int counter = 0;
        for (int i = line; i < currentHeight; i++) {
            for (int j = column; j < column + width; j++) {

                if (i == line && j == column) result[i][j] = ('╔');
                else if (i == line && j > column + 1 && counter < headLine.length()) {
                    result[i][j] = (headLine.charAt(counter));
                    counter++;
                } else if (i == line && (j == currentWidth - 1)) result[i][j] = ('╗');
                else if (i == line) result[i][j] = ('═');
                else if (i == currentHeight - 1 && j == column) result[i][j] = ('╚');
                else if (i == currentHeight - 1 && j == currentWidth - 1) result[i][j] = ('╝');
                else if (i == currentHeight - 1) result[i][j] = ('═');
                else if (i != line && i != currentHeight - 1 && (j == column || j == currentWidth - 1))
                    result[i][j] = ('║');
                else result[i][j] = ' ';
            }
            System.out.println();
        }
        element.setElementPos(line + 1, column + 2);
        element.draw(result);

    }

    @Override
    public void setElementPos(int i, int j) {

        line = i;
        column = j;
    }
}
