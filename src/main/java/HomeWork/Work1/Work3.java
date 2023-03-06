//3. Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.


package HomeWork.Work1;
import java.util.Arrays;
import java.util.Scanner;



public class Work3 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        int[] array = {3, 3, 2, 3, 2, 2, 1, 5, 6, 7, 7, 8, 3, 2, 3, 4};
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] == number) {
                int transfer = array[i];
                if (array[array.length - 1 - count] != number){
                    array[i] = array[array.length - 1 - count];
                    array[array.length - 1 - count] = transfer;
                    count = count + 1;
                }else{
                    count = count + 1;
                    array[i] = array[array.length - 1 - count];
                    array[array.length - 1 - count] = transfer;
                }
            }
        }System.out.println(Arrays.toString(array));
    }
}
