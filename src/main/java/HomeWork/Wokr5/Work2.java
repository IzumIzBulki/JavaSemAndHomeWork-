//2. Пусть дан список сотрудников:
//        Иван Иванов
//        Светлана Петрова
//        Кристина Белова
//        Анна Мусина
//        Анна Крутова
//        Иван Юрин
//        Петр Лыков
//        Павел Чернов
//        Петр Чернышов
//        Мария Федорова
//        Марина Светлова
//        Мария Савина
//        Мария Рыкова
//        Марина Лугова
//        Анна Владимирова
//        Иван Мечников
//        Петр Петин
//        Иван Ежов
//        Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

package HomeWork.Wokr5;


import java.util.*;

public class Work2 {
    public static void main(String[] args) {
        outputRepeatedNames();

    }

    private static void outputRepeatedNames() {
        for (String key : listRepeatedNames().keySet()) {
            System.out.println(key + ": " + listRepeatedNames().get(key));
        }
    }
    private static Map<String, Integer> listRepeatedNames() {
        Map<String, Integer> list = new HashMap<>();
        for (String nameSearch : listEmployees().values()) {
            int Count = 0;
            for (String name : listEmployees().values()) {
                if (nameSearch == name){
                    Count ++;
                    list.put(name, Count);
                }
            }
        }return list;
    }
    private static Map<String, String> listEmployees() {
        Map<String, String> listEmployees = Map.ofEntries(
                Map.entry("Иванов", "Иван"),
                Map.entry("Петрова", "Светлана"),
                Map.entry("Белова", "Кристина"),
                Map.entry("Мусина", "Анна"),
                Map.entry("Крутова", "Анна"),
                Map.entry("Юрин", "Иван"),
                Map.entry("Лыков", "Петр"),
                Map.entry("Чернов", "Павел"),
                Map.entry("Чернышов", "Петр"),
                Map.entry("Федорова", "Павел"),
                Map.entry("Светлова", "Мария"),
                Map.entry("Савина", "Мария"),
                Map.entry("Рыкова", "Мария"),
                Map.entry("Лугова", "Марина"),
                Map.entry("Владимирова", "Павел"),
                Map.entry("Мечников", "Анна"),
                Map.entry("Петин", "Петр"),
                Map.entry("Ежов", "Иван")
        );
        return listEmployees;
    }
}

