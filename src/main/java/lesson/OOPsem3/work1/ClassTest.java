package lesson.OOPsem3.work1;

public class ClassTest {
    public static void main(String[] args) {


    MyValue myValue; // объявление ссылки на интерфейс
    myValue = () -> 98.6;
    System.out.println(myValue.getValue());
    MyValue2 myValue2 = (n)->1.0/n;
    System.out.println(myValue2.getValue(4.0));
    System.out.println(myValue2.getValue(8.0));



    }
}
