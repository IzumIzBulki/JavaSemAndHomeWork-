package lesson;

import java.util.Scanner;

public class lessonNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = sc.next();
        System.out.print("Введите свой возраст: ");
        int age = sc.nextInt();
        System.out.print(name + ", вам " + age + " лет! ");
    }
}
