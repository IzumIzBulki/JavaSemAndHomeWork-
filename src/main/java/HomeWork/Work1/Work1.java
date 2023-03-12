//    1. Задать одномерный массив и найти в нем минимальный и максимальный элементы



package HomeWork.Work1;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;


public class Work1 {
    public static void main(String[] args) {
        System.out.println("первый способ решения:");
        arr1();
        System.out.println("");
        System.out.println("второй способ решения:");
        arr2();
    }
    static void arr1() {
        int[] arr = {5, 2, 10, 3};
        System.out.println(Arrays.stream(arr).max());
        System.out.print(Arrays.stream(arr).min());
    }
    static void arr2() {
        int max = MIN_VALUE;
        int min = MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Введите " + (i + 1) + " элемент массива: ");
            int number = sc.nextInt();
            arr[i] = number;
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.printf("Max number array: " + max + " Min number array: " + min);
    }
}



