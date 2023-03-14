package lesson;

public class OOP_11 {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    static double distance(OOP_1 a, OOP_1 b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public static void main(String[] args) {
        OOP_1 a = new OOP_1(0, 2);
        OOP_1 b = new OOP_1(0);
        System.out.println(a.getX());
        System.out.println(a.getY());
        System.out.println(b);
        var dis = OOP_11.distance(a, b);
        System.out.println(dis);
    }
}