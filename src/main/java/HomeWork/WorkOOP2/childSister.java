package HomeWork.WorkOOP2;



public class childSister extends Sister implements Child {

    public childSister(int age, String name, String eyeColor, int weight, int height, int earnings) {
        super(age, name, eyeColor, weight, height, earnings);
    }

    @Override
    public String getInfo() {
        return  this.getName();

    }
    @Override
    public String diaper() {
        return "Ребенку надо сменить подгузник";
    }

    @Override
    public String eat() {
        return "Ребенка надо накормить";
    }

    @Override
    public String cry() {
        return "Ребенок плачет";
    }
}
