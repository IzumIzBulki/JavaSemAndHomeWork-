package lesson.OOPsem5.Work1;

public abstract class Human<S extends String, N extends Number> {
    S name, status, gender;
    N age;

    public Human(S name, S status, S gender, N age) {
        this.name = name;
        this.status = status;
        this.gender = gender;
        this.age = age;
    }

    public S getName() {return name;}
    public S getStatus() {return status;}
    public S getGender() {return gender;}
    public N getAge() {return age;}
    public void setAge(N age) {this.age = age;}
}
