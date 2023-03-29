package HomeWork.WorkOOP1;

public class Sister extends Human{
    public Sister(){
        super(15, "Elena", "Green", 50, 165, 500);
    }


    public String getInfo() {
        return String.format(super.info() +"\n" + this.getName() +"\n" + this.studies() +"\n" + this.sew());
    }

    public String sew() {
        return "Умеет шить";
    }
    public String studies() {
        return "Учится в университете";
    }

}
