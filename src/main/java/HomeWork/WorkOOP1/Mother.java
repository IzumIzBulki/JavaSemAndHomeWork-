package HomeWork.WorkOOP1;

public class Mother extends Human{


    public Mother(int age, String name, String eyeColor, int weight, int height, int earnings) {
        super(age, name, eyeColor, weight, height, earnings);
    }


    public String getInfoMother() {
        return String.format(this.getInfo() +"\n" + this.getName() +"\n" + this.wash() +"\n" + this.cook());
    }

    public String cook() {
        return "Умеет готовить на плите";
    }
    public String wash() {return "Умеет пользоваться стиральной машиной";}
}
