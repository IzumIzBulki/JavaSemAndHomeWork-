package HomeWork.WorkOOP2;


public class Dad extends Human implements HumanInterface {


    public Dad(int age, String name, String eyeColor, int weight, int height, int earnings) {
        super(age, name, eyeColor, weight, height, earnings);
    }


    @Override
    public String getInfo() {
        return  this.getName() + "\n" +
                this.work() + "\n" +
                this.cook() + "\n" +
                this.skill() + "\n" +
                this.education();
    }

    @Override
    public String cook() {
        return "Умеет готовить на мангале";
    }

    @Override
    public String work() {
        return "Работает водителем";
    }

    @Override
    public String skill() {
        return "Имеет все категории на права";
    }

    @Override
    public String education() {
        return "Закончил школу";
    }
}
