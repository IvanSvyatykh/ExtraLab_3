public interface ILayoutable {

     void calculate();
     int getWidth();
     int getHeight();
     void draw(char[][] result);
     void setElementPos(int i , int j);
}
