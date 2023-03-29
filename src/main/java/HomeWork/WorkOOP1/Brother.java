package HomeWork.WorkOOP1;

public class Brother extends Human{

    public Brother(){
        super(18, "Sergey", "Red", 70, 195, 500);

    }


    public String getInfo() {
        return String.format(super.info() +"\n" + this.getName() +"\n" + this.waiter() +"\n" + this.shooting());
    }

    public String shooting() {
        return "Умеет стрелять из ружья";
    }
    public String waiter() {
        return "Работает официантом";
    }



}
