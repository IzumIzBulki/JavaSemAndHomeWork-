package lesson.OOPsem4.work4;

public class MethodDemo {
    static <T extends Comparable<T>, V extends T> boolean array(T[] x, V[] y){
        if (x.length != y.length){
            return false;
        }
        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i])){
                return false;
            }
        else return true;
        }return true;
    }

    public static void main(String[] args) {
        Integer num1[] = {1, 2, 3, 4};
        Integer num2[] = {1, 2, 3, 4};
        Integer num3[] = {4, 2, 3, 4};
        Integer num4[] = {1, 2, 3, 4, 6};

        if (array(num1, num2)){
            System.out.println("num1 и num2 одинаковы");
        }

        if (array(num1, num3)){
            System.out.println("num1 и num3 одинаковы");
        }

        if (array(num1, num4)){
            System.out.println("num1 и num4 одинаковы");
        }
        Double num5[] = {1.1, 2.2, 3.3, 4.4};

        if (array(num5, num5)){
            System.out.println("num5(дробное) и num5(дробное) одинаковы??");
        }

    }


}
