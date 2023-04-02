package HomeWork.WorkOOP1;

public class childSister extends Sister{

    public childSister(int age, String name, String eyeColor, int weight, int height, int earnings) {
        super(age, name, eyeColor, weight, height, earnings);
    }

    public String getInfo() {
        return String.format(super.getInfo() +"\n" + this.getName() +"\n" + this.speech());
    }

    public String speech() {
        return "Агу... агу....";
    }

}
