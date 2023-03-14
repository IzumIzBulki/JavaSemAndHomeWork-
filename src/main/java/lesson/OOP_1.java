package lesson;

/**
 * Это точка 2D
 */
public class OOP_1 {
    private int x, y;

    /**
     * Это конструктор ....
     * @param valueX это координата Х
     * @param valueY это координата У
     */
    public OOP_1(int valueX, int valueY){
        x = valueX;
        y = valueY;
    }
    public OOP_1(int value){
        this(value, value);
    }

    public OOP_1(){
       this(0);
    }
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int value){
       this.x = value;
    }

    public void setY(int value){
        this.y = value;
    }

    private String getInfo(){
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}


//    public OOP_1(){
//        x = 0;
//        y = 0;
//    }
//
//    public OOP_1(int value){
//        x = value;
//        y = value;
//    }
