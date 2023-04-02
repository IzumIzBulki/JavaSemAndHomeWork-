package HomeWork.WorkOOP2;


public class Sister extends Mother implements HumanInterface {


    public Sister(int age, String name, String eyeColor, int weight, int height, int earnings) {
        super(age, name, eyeColor, weight, height, earnings);
    }
    public String feedBaby() {
        return "Кормит ребенка";
    }
    public String changeDiaper() {
        return "Сменила подгузник";
    }

    @Override
    public String cook() {
        return "Готовит как мама";
    }

    @Override
    public String work() {
        return "Работает юристом";
    }

    @Override
    public String skill() {
        return "Умеет хорошо шить";
    }

    @Override
    public String education() {
        return "Имеет высшее юридическое образование";
    }
}
