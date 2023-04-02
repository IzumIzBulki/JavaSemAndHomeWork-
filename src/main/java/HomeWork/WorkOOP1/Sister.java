package HomeWork.WorkOOP1;

public class Sister extends Mother{


    public Sister(int age, String name, String eyeColor, int weight, int height, int earnings) {
        super(age, name, eyeColor, weight, height, earnings);
    }

    public String getInfoSister() {
        return String.format(super.getInfo() +"\n" + this.getName() +"\n" + this.studies() +"\n" + this.sew());
    }


    public String sew() {
        return "Умеет шить";
    }
    public String studies() {
        return "Учится в университете";
    }

}
