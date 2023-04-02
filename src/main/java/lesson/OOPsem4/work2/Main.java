package lesson.OOPsem4.work2;

public class Main {
    public static void main(String[] args) {
        Numeric<Integer> ob = new Numeric<>(5);
        System.out.println("Обратная величина ob: " + ob.getNum());
        System.out.println("Дробная часть ob: " + ob.getNum2());

        Numeric<Double> ob2 = new Numeric<>(5.2);
        System.out.println("Обратная величина ob: " + ob2.getNum());
        System.out.println("Дробная часть ob: " + ob2.getNum2());

//        Numeric<String > ob3 = new Numeric<>("test");
//        System.out.println("Обратная величина ob: " + ob3.getNum());
//        System.out.println("Дробная часть ob: " + ob3.getNum2());



    }
}
