package HomeWork.WorkOOP1;

public class Mother extends Human{



    public Mother(){
        super(35, "Natalie", "Grey", 65, 180, 3000);

    }

    public String getInfo() {
        return String.format(super.info() +"\n" + this.getName() +"\n" + this.wash() +"\n" + this.cook());
    }

    public String cook() {
        return "Умеет готовить на плите";
    }
    public String wash() {
        return "Умеет пользоваться стиральной машиной";
    }
}
