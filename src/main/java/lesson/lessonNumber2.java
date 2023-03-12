package lesson;

import java.util.Scanner;

public class lessonNumber2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите длину массива: ");
//        int n = sc.nextInt();
//        String a = "c1";
//        String b = "c2";
//        StringBuilder d = new StringBuilder();
//        for (int i = 0; n / 2 > i; i++) {
//            d.append(a + b);
//        }
//        System.out.println(d);

        String c3 = new String();
        c3 = "aaaabbbcdd";
        System.out.println(archive(c3));


    }
    public static String archive (String c1){
        c1 += "0";
        int count = 1;
        String result = "";
        for (int i = 1; i < c1.length(); i++) {
            if (c1.charAt(i) == c1.charAt(i - 1)) {
                count++;
            } else {
                if (count == 1) {
                    result += "" + c1.charAt(i - 1);
                } else {
                    result += "" + c1.charAt(i - 1) + count;
                    count = 1;
                }
            }
        }
        return result;
    }
}

//    Дано четное число N (>0) и символы c1 и c2.
//    Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1
//   2. Напишите метод, который сжимает строку.
//    Пример: вход aaaabbbcdd
//
