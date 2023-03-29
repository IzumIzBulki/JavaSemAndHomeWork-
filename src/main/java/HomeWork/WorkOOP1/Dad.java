package HomeWork.WorkOOP1;

public class Dad extends Human{

    public Dad(){
        super(38, "Maksim", "Grey", 80, 185, 6000);
    }

    public String getInfo() {
        return String.format(super.info() +"\n" + this.getName() +"\n" + this.license() +"\n" + this.cook());
    }

    public String cook() {
      return "Умеет готовить на мангале";
    }
    public String license() {
      return "Есть права";
    }

}
