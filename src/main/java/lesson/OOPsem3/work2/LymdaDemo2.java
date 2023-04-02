package lesson.OOPsem3.work2;

public class LymdaDemo2 {
    public static void main(String[] args) {
        NumerikTest isFactor = (f, d) -> (f%d)==0;

        if (isFactor.test(10, 2)) {
            System.out.println("2 делитель 10ти");
        }
        if (!isFactor.test(10, 3)) {
            System.out.println("3 не делитель 10ти");
        }
        NumerikTest isFactor2 = (f,d) -> (f<d);
        if (isFactor2.test(2, 10)) {
            System.out.println("2 < 10ти");
        }
        if (!isFactor2.test(10, 3)) {
            System.out.println("10 !< 3");
        }
        NumerikTest isFactor3 = (f,d) -> (f<0 ? -f:f)==(d<0 ? -d:d);  // делал комментарии в видео для понимания, 3 семинар, работает так "если тру слева и тру справа, они равны и выполняется работа дальше"
        if (isFactor3.test(4, -4)) {
            System.out.println("4 = -4");
        }
        if (!isFactor3.test(4, -5)) {
            System.out.println("4 != -5");
        }

    }
}
