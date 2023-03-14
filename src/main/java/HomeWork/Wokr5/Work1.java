//1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.


package HomeWork.Wokr5;

import java.util.*;

public class Work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();

        menu();
        System.out.print("Выберите пункт меню: ");
        Integer menuItem = sc.nextInt();
        System.out.println();

        while (menuItem != 0) {
            if (menuItem == 1) {
                showTelephoneBook(phoneBook);
            } else if (menuItem == 2) {
                addData(phoneBook);
            } else if (menuItem == 3) {
                contactSearch(phoneBook);
            } else if (menuItem == 4) {
                deleteContact(phoneBook);
            }
            menu();
            System.out.println();
            System.out.print("Выберите пункт меню: ");
            menuItem = sc.nextInt();
        }
    }

    private static void deleteContact(Map<String, ArrayList<Integer>> contact) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите фамилию контакта, который желаете удалить: ");
        String surname = sc.next();
        contact.remove(surname);
    }


    public static void showTelephoneBook(Map<String, ArrayList<Integer>> phoneNumbers) {
        for (String key : phoneNumbers.keySet()) {
            System.out.println("Фамилия " + key + "; Номер телефона: " + phoneNumbers.get(key));
        }
    }

    public static Map<String, ArrayList<Integer>> addData(Map<String, ArrayList<Integer>> data) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите фамилию человека, которую надо добавить в книгу: ");
        String surname = sc.next();
        System.out.print("Введите номер телефона " + surname + " : ");
        Integer phoneNumber = sc.nextInt();
        if (data.get(surname) == null) {
            data.put(surname, new ArrayList<Integer>());
        }
        data.get(surname).add(phoneNumber);
        return data;
    }

    public static void menu() {
        System.out.println("Телефонный справочник");
        System.out.println("1: Показать книгу");
        System.out.println("2: Добавить контак");
        System.out.println("3: Найти контакт");
        System.out.println("4: Удалить контакт");
        System.out.println("0: Для выхода!");
    }

    public static void contactSearch(Map<String, ArrayList<Integer>> contact) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите фамилию человека, которого надо найти: ");
        String surname = sc.next();
        System.out.println("Фамилия " + surname + "; Номер телефона: " + contact.get(surname));
    }

}
