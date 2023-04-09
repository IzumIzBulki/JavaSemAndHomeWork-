package lesson.OOPsem5.Work1;

public class Doctor extends Human implements ActionHuman{

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
    @Override
    public String action() {return "Лечит животное";}

//    public boolean examination(Animal animals){
//        if (animals.getAge() > 10){
//            return true;
//        }else return false;
//    }
}
