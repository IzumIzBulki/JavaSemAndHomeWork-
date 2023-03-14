//2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

package HomeWork.Work3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Work2 {
    public static void main(String[] args) {
        List<Integer> initialList = createList();
        System.out.println(initialList);
        System.out.println("MinNumber: " + Collections.min(initialList));
        System.out.println("MaxNumber: " + Collections.max(initialList));
        System.out.println("AverageNumber: " + initialList.stream().mapToInt(a -> a).average().orElse(0));
    }
    private static List<Integer> createList() {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i<10) {
            Integer a = (int) (1 + Math.random() * 9);
            list.add(0, a);
            i++;
        }
        return list;
    }
}