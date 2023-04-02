package lesson.OOPsem4.work1;

public class Gen<T, V> {
    T ob;
    V ob2;
    public Gen(T ob, V ob2){
        this.ob = ob;
        this.ob2 = ob2;
    }

    void showType(){
        System.out.println("Тип Т это: " + ob.getClass().getName());
        System.out.println("Тип Т это: " + ob2.getClass().getName());
    }

    T getOb(){
        return ob;
    }
    V getOb2(){
        return ob2;
    }

}

