package lesson.OOPsem5.Work1;

public class Cat extends Animal implements ActionAnimal{

    public Cat(String type, String name, String color, String gender, Number age, Number weight) {
        super(type, name, color, gender, age, weight);
    }



    @Override
    public String voice() {return "Mяу, Мяу";}

    @Override
    public String toString() {
        return "Cat{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
