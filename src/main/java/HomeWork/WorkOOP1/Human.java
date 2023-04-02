package HomeWork.WorkOOP1;

public abstract class Human {
    private int age;
    private String name;
    private String eyeColor;
    private int weight;
    private int height;
    private int earnings;

    public Human(int age, String name, String eyeColor, int weight, int height, int earnings) {
        this.age = age;
        this.name = name;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.height = height;
        this.earnings = earnings;
    }


    public String getInfo() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", earnings=" + earnings +
                '}' + "\n" +
                "Наследник характера = " + this.getClass().getSuperclass().getSimpleName();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getEarnings() {
        return earnings;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }


}
