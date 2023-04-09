package lesson.OOPsem5.Work1;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Сиамский", "Максим", "Серый", "Мужской", Numbers.getR(2), Numbers.getR(5));
        Doctor d = new Doctor("Артем", "Ветеринар", "Мужской", Numbers.getR(25));

        System.out.println(c);
        System.out.println(d);




    }
}
