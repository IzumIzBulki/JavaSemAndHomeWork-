package lesson.OOPsem5.Work1;

public class Doctor extends Human {

    public Doctor(String name, String status, String gender, Number age) {
        super(name, status, gender, age);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public static Integer treatment (int x) {return x + (int) Numbers.getR(5);}


}
