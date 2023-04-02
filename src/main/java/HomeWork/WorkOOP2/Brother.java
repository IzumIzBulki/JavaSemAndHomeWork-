package HomeWork.WorkOOP2;


public class Brother extends Dad implements HumanInterface {


    public Brother(int age, String name, String eyeColor, int weight, int height, int earnings) {
        super(age, name, eyeColor, weight, height, earnings);
    }

    @Override
    public String cook() {
        return "Не умеет готовить";
    }

    @Override
    public String work() {
        return "Работает официантом";
    }

    @Override
    public String skill() {
        return "Владеет лицензией на оружие";
    }

    @Override
    public String education() {
        return "Получил красный диплом";
    }
}
