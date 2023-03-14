//1. Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.



package HomeWork.Work4;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;



public class Work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList firstlList = new LinkedList<>();
        System.out.println("Введите end для выхода!");
        System.out.println("Введите print для разворота списка!");
        System.out.println("Введите revert что бы удалить последний введенный элемент!");
        System.out.print("Введите строку: ");
        String word = sc.next();
        while (!Objects.equals(word, "end")){
            if (!Objects.equals(word, "print") & !Objects.equals(word, "revert")){
                firstlList.add(word);
            }
            System.out.print("Введите строку: ");
            word = sc.next();
            if (Objects.equals(word, "print")) {
                firstlList = print(firstlList);
                System.out.println(firstlList);
            }
            if (Objects.equals(word, "revert")) {
               firstlList.removeLast();
               System.out.println(firstlList);
            }
        }
        System.out.print(firstlList);
    }
    private static LinkedList print(LinkedList list) {
        LinkedList finalList = new LinkedList<>();
        while (list.size() != 0){
            finalList.add(list.pollLast());
        }
        return finalList;
    }

}
