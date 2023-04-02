package lesson.OOPsem2;

import lesson.OOPsem22.stat;

public class main {
    public static void main(String[] args) {
        int uId = stat.getAdmin();
        numtest num = new numtest();
        numTest2 num2 = new numTest2();

        test ob;

        for (int i = 0; i < 5; i++) {
            ob = num;
            System.out.println("Следующее значение:" + ob.getNext());

//            ob = count;
            System.out.println("Следующее значение:" + ob.getNext());
        }

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Следующее значение:" + num.getNext());
//        }
//
//        System.out.println("Сброс");
//        num.reset();
//        System.out.println("Начальное значение 100");
//        num.setStart(100);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Следующее значение:" + num.getNext());
//        }


    }
}
