
public class Frame implements ILayoutable {
    private String headLine;

    private ILayoutable element;
    private int width;
    private int height;


    public Frame(String headLine  , ILayoutable element){

        this.headLine=headLine;
        this.element =element;
    }

    public void calculate(){
        width = element.getWidth();
        width +=4;
        height = element.getHeight();
        height +=4;
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
