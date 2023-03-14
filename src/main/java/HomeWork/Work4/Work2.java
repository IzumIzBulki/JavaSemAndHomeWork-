//2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


package HomeWork.Work4;

import java.util.*;

public class Work2 {
    public static void main(String[] args) {
        LinkedList initialList = new LinkedList(Arrays.asList(1,2,3,4,"5","6","7",8.4,9.4,10.4));
        System.out.println(initialList);
        System.out.println(reversal(initialList));
    }
    private static LinkedList reversal(LinkedList list) {
        LinkedList finalList = new LinkedList<>();
        while (list.size() != 0){
            finalList.add(list.pollLast());
        }
        return finalList;
    }


}
