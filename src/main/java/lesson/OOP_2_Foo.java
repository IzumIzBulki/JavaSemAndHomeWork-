package lesson;

public class OOP_2_Foo {
    public Integer value;

    private static Integer count;
    public static Integer getCount(){
        return count;
    }

//    public static Integer count;
    public OOP_2_Foo(){
        count ++;
    }

    static {
        count = 0;
    }

    public void printCount(){
        System.out.println(count);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
