public class Rectangle implements ILayoutable {

    private ILayoutable element;
    private int width;
    private int height;
    private int column = 0;
    private int line = 0;


    public Rectangle(ILayoutable element) {

        this.element = element;
    }

    @Override
    public void calculate() {
        element.calculate();
        height = element.getHeight() + 2;
        width = element.getWidth() + 4;
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
        for (int i = line; i < currentHeight; i++) {
            for (int j = column; j < currentWidth; j++) {
                if (i == line && j == column) result[i][j] = ('┌');
                else if (i == line && (j == currentWidth - 1)) result[i][j] = ('┐');
                else if (i == line) result[i][j] = ('─');
                else if (i == currentHeight - 1 && j == column) result[i][j] = ('└');
                else if (i == currentHeight - 1 && j == currentWidth - 1) result[i][j] = ('┘');
                else if (i == currentHeight - 1) result[i][j] = ('─');
                else if (i != line && i != currentHeight - 1 && (j == column || j == currentWidth - 1))
                    result[i][j] = ('│');
                else result[i][j] = ' ';
            }
            System.out.println();

        }
        element.setElementPos(line + 1, column + 2 , width-2,height-2);
        element.draw(result);
    }

    @Override
    public void setElementPos(int i, int j , int width ,int height) {

        line = i;
        column = j;
        this.width=width;
    }

}
