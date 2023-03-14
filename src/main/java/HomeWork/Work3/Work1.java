//1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)


package HomeWork.Work3;
import java.util.ArrayList;
import java.util.List;

public class Work1 {
    public static void main(String[] args) {
        List<Integer> initialList = createList();
        System.out.println(initialList);
        List<Integer> finalList = filterList(initialList);
        System.out.println(finalList);
    }

    private static List<Integer> filterList(List<Integer> list) {
        list.removeIf( x-> (x % 2 == 0));
        return list;
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
