package lesson;

public class OOP_2_Program {
    public static void main(String[] args) {
        OOP_2_Foo f1 = new OOP_2_Foo();
        f1.value = 123;
//        System.out.println(f1.value);

        f1.printCount();

        OOP_2_Foo f2 = new OOP_2_Foo();
        f2.value = 222;
//        System.out.println(f2.value);

        f2.printCount();

        OOP_2_Foo f3 = new OOP_2_Foo();
        f3.value = 444;
//        System.out.println(f3.value);

        f3.printCount();


    }

}
