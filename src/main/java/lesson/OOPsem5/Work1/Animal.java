package lesson.OOPsem5.Work1;




public abstract class Animal<S extends String, N extends Number> {

    S type, name, color, gender;
    N age, weight, health;


    public Animal(S type, S name, S color, S gender, N age, N weight, N health) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.health = health;
    }

    public N getHealth() {return health;}
    public void setHealth(N health) {this.health = health;}
    public S getType() {return type;}
    public void setType(S type) {this.type = type;}
    public S getName() {return name;}
    public void setName(S name) {this.name = name;}
    public S getColor() {return color;}
    public S getGender() {return gender;}
    public N getAge() {return age;}
    public void setAge(N age) {this.age = age;}
    public N getWeight() {return weight;}
    public void setWeight(N weight) {this.weight = weight;}
    abstract String voice();
}
