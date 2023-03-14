//package lesson;
//
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.Map;
//import java.util.Scanner;
//
//public class lessonNumber5 {
//    public static void main(String[] args) {
//        Map<String, String> passports = new HashMap<>();
//        passports.put("М","1000");
//        passports.put("X","10");
//        passports.put("I","1");
//        Scanner sc = new Scanner(System.in);
//        String word = "XXМXXXXX";
//        for (int i = 0; i < word.length(); i++) {
//            System.out.println(passports.get(Character.toString(word.charAt(i))));
//        }
//        for (String key : passports.keySet()) {
//            System.out.println(key + "-" + passports.get(key));
//        }
//        for (Map.Entry<String, String> entry : passports.entrySet()) {
//            System.out.println(entry.getKey() + "-" + entry.getValue());
//        }
//
//
//
//    }
//}




package lesson;
//Написать метод, который переведет число из римского формата записи в арабский.
// Например, MMXXII = 2022

import java.util.*;

public class lessonNumber5 {
    public static void main(String[] args) {
        reformatNumber();

    }

    private static Integer reformatNumber() {
        Map<String, Integer> romanianNumber = romanianNumber();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в римском формате: ");
        String rom = in.next();
        int result = 0;
        for (int i = 0; i < rom.length() - 1; i++) {
            int currrent = romanianNumber.get(Character.toString((rom.charAt(i))));
            int next = romanianNumber.get(Character.toString((rom.charAt(i + 1))));
            if (currrent < next) {
                result -= currrent;
            } else {
                result += currrent;
            }
        }
        result += romanianNumber.get(Character.toString((rom.charAt(romanianNumber().size() - 1))));
        System.out.println(result);
        return result;
    }

    private static Map<String, Integer> romanianNumber() {
        Map<String, Integer> romNumber = new HashMap<>();
        romNumber.put("I", 1);
        romNumber.put("X", 10);
        romNumber.put("M", 1000);
        romNumber.put("C", 13);
        romNumber.put("V", 14);
        romNumber.put("N", 15);
        return romNumber;
    }
}
//    private static Map<Character, Integer> romanianNumber() { // НЕИЗМЕНЯЕМАЯ И МАКСИМУМ 10 ЭЛЕМЕНТОВ
//        Map<Character, Integer> romNumber = Map.of(
//                'I', 1,
//                'X', 10,
//                'C', 13,
//                'V', 14,
//                'N', 15
//        );
//        return romNumber;
//    }
//
//    private static Map<Integer, String> romanianNumber2232323() { // НЕИЗМЕНЯЕМАЯ И ДЛЯ МНОЖЕСТВА ЭЛЕМЕНТОВ
//        Map<Integer, String> romNumber = Map.ofEntries(
//                Map.entry(100, "M"),
//                Map.entry(10, "MМ"),
//                Map.entry(1, "MС"),
//                Map.entry(1000, "MВ"),
//                Map.entry(1001, "Mап"),
//                Map.entry(1002, "Mвыа"),
//                Map.entry(1003, "Mып"),
//                Map.entry(1004, "Mв"),
//                Map.entry(1005, "Mполд"),
//                Map.entry(1006, "Mап")
//        );
//        return romNumber;
//    }
//    private static void test() {
//        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
//        map.put(1, new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
//        map.put(2, new ArrayList<>(Arrays.asList(234, 234)));
//        map.put(3, new ArrayList<>(Arrays.asList(12234324, 234324234)));
//
//        for (Integer key : map.keySet()) {
//            System.out.println("key " + key + ": " + map.get(key));
//            System.out.println();
//        }
//    }
//
//
//    private static void ex0() {
//        Map<String, String> passports = new HashMap<>();
//        passports.put("12345", "Иванов");
//        passports.put("345345", "Петров");
//        passports.put("12342345", "Иванов");
//        passports.put("54635634", "Васильев");
//        passports.put("23452345", "Петров");
//        passports.put("56743546", "Иванов");
//
//        for (String key : passports.keySet()) {
//            System.out.println(key + " - " + passports.get(key));
//        }
//
//        for (Map.Entry<String, String> entry : passports.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }
//    }
//    private static Integer ex3(String romanNum) {
//        Map<Character, Integer> romanToDecimalMap = Map.of(
//                'I', 1,
//                'V', 5,
//                'X', 10,
//                'L', 50,
//                'C', 100,
//                'D', 500,
//                'M', 1000
//        );
//        StringBuilder romanNumSB = new StringBuilder(romanNum.trim()).reverse();
//        int decimalNum = 0;
//        int prevNum = -1;
//        for (Character romanChar : romanNumSB.toString().toCharArray()) {
//            int currentNum = romanToDecimalMap.get(romanChar);
//            if (currentNum < prevNum) {
//                currentNum *= -1;
//            }
//            decimalNum += currentNum;
//            prevNum = currentNum;
//        }
//        return decimalNum;
//    }
//
//    public static String ex4(int number) {
//        Map<Integer, String> arabicToRomanConstMap = Map.ofEntries(
//                Map.entry(1000, "M"),
//                Map.entry(900, "CM"),
//                Map.entry(500, "D"),
//                Map.entry(400, "CD"),
//                Map.entry(100, "C"),
//                Map.entry(90, "XC"),
//                Map.entry(50, "L"),
//                Map.entry(40, "XL"),
//                Map.entry(10, "X"),
//                Map.entry(9, "IX"),
//                Map.entry(5, "V"),
//                Map.entry(4, "IV"),
//                Map.entry(1, "I")
//        );
//        Map<Integer, String> arabicToRomanMap = new TreeMap<>(Comparator.reverseOrder());
//        arabicToRomanMap.putAll(arabicToRomanConstMap);
//        StringBuilder romanNumSB = new StringBuilder();
//        for (Map.Entry<Integer, String> entry : arabicToRomanMap.entrySet()) {
//            int arabic = entry.getKey();
//            String roman = entry.getValue();
//            while (number >= arabic) {
//                romanNumSB.append(roman);
//                number -= arabic;
//            }
//        }
//        return romanNumSB.toString();
//    }
//}