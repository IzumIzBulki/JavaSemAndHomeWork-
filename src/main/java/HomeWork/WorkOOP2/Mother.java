package HomeWork.WorkOOP2;



public class Mother extends Human implements HumanInterface {

    public Mother(int age, String name, String eyeColor, int weight, int height, int earnings) {
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
        return "Умеет готовить на газовой плите";
    }

    @Override
    public String work() {
        return "Работает бухгалтером";
    }

    @Override
    public String skill() {
        return "Умеет шить";
    }

    @Override
    public String education() {
        return "Получила высшее образование";
    }

}
