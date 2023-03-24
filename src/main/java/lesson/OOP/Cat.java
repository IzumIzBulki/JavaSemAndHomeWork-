package lesson.OOP;

public class Cat extends Animal{


    public Cat(String type, String name, Integer age, Double weight, Boolean isFly, Boolean isWalk, Boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
    }

    public Cat(String type, String name, Double weight, Boolean isFly, Boolean isWalk, Boolean isSwim) {
        super(type, name, weight, isFly, isWalk, isSwim);
    }
    public void say (){
        System.out.println("Мяу, мяу");
    }

}
