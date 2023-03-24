//Task_1
//        Опишите класс Animal. У класса Animal должны быть свойства:
//
//        type - тип животного (String)
//        name - имя животного (String)
//        age - возраст животного (int)
//        weight - вес животного (double)
//        isFly - ответ на вопрос, умеет ли это животное летать? (boolean)
//        isWalk - ответ на вопрос, умеет ли это животное ходить? (boolean)
//        isSwim -  ответ на вопрос, умеет ли это животное плавать? (boolean)
//        У животного должны быть методы:
//
//        display  - выводит информацию о животном в формате: "Тип: <Тип животного>, Имя: <Имя животного>, Возраст: <Возраст животного>, Вес: <Вес животного>, Умеет летать: <Да/Нет>, Умеет ходить: <Да/Нет>, Умеет плавать: <Да/Нет>."
//        rename(String) - принимает новое имя животного
//        holiday(int) - принимает на вход число праздничных дней. Увеличивает массу животного на 0.1 за каждый праздничный день.
//
//Можете проверить свой класс, запустив его с этим кодом:
//
//class Main{
//    public static void main(String[] args) {
//        Animal tiger = new Animal();
//        tiger.type = "тигр";
//        tiger.name = "Артём";
//        tiger.age = 15;
//        tiger.weight = 300.6;
//        tiger.isSwim = true;
//        tiger.isWalk = true;
//        tiger.isFly = false;
//        tiger.display();
//        tiger.rename("Антон");
//        tiger.display();
//
//        Animal sparrow = new Animal();
//        sparrow.type = "воробей";
//        sparrow.name = "Капитан Джек";
//        sparrow.age = 3;
//        sparrow.weight = 2;
//        sparrow.isSwim = false;
//        sparrow.isWalk = true;
//        sparrow.isFly = true;
//        sparrow.display();
//        sparrow.holiday(2);
//        sparrow.display();
//    }
//}

package lesson.OOP;

import java.util.Random;

public class Animal {
    public String type;

    public  String name;
    public  Integer age;
    public  Double weight;
    public  Boolean isFly;
    public  Boolean isWalk;
    public  Boolean isSwim;

    public Animal(String type, String name, Integer age, Double weight, Boolean isFly, Boolean isWalk, Boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public Animal(String type, String name, Double weight, Boolean isFly, Boolean isWalk, Boolean isSwim) {
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public String display() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", isFly=" + isFly +
                ", isWalk=" + isWalk +
                ", isSwim=" + isSwim +
                '}';
    }

    public void rename(String name) {
        this.name = name;
    }

    public void holiday(Integer numberHolidays) {
        this.weight = weight + numberHolidays*0.1;
    }


}


