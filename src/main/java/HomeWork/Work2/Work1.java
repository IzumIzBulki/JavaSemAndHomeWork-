//1. Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает boolean значение).


package HomeWork.Work2;
import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String n = sc.next();
        System.out.print(archive(n));

    }
    public static boolean archive (String c1) {
        int i = 0;
        while (c1.charAt(i) == c1.charAt(c1.length()-1-i) && i < c1.length()/2)
            i++;
        return (i == c1.length()/2);
    }
}
