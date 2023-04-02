package HomeWork.WorkOOP1;

public class Brother extends Dad{


    public Brother(int age, String name, String eyeColor, int weight, int height, int earnings) {
        super(age, name, eyeColor, weight, height, earnings);
    }

    public String getInfoBrother() {
        return String.format(super.getInfo() +"\n" + this.getName() +"\n" + this.waiter() +"\n" + this.shooting());
    }

    public String shooting() {
        return "Умеет стрелять из ружья";
    }
    public String waiter() {
        return "Работает официантом";
    }



}
