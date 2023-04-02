package HomeWork.WorkOOP1;

public class Dad extends Human{


    public Dad(int age, String name, String eyeColor, int weight, int height, int earnings) {
        super(age, name, eyeColor, weight, height, earnings);
    }

    public String getInfoDad() {
        return String.format(super.getInfo() +"\n" + this.getName() +"\n" + this.license() +"\n" + this.cook());
    }

    public String cook() {
      return "Умеет готовить на мангале";
    }
    public String license() {
      return "Есть права";
    }

}
