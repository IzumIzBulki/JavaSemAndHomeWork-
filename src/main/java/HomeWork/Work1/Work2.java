//2. Написать метод, который определяет, является ли год високосным, и возвращает boolean
//        (високосный - true, не високосный - false). Каждый 4-й год является високосным,
//        кроме каждого 100-го, при этом каждый 400-й – високосный.



package HomeWork.Work1;
import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год: ");
        int n = sc.nextInt();
        System.out.print(n % 4 == 0 && n % 400 == 0 || n % 100 != 0);
    }
}
