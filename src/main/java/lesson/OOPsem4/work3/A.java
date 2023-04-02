package lesson.OOPsem4.work3;

public class A {
    //
}
class B extends A{
    //
}
class C extends B{

}
class D extends C{

}
class gen2<T>{
    T ob;
    public gen2(T ob) {
        this.ob = ob;
    }
//    static void test(gen2<? super B> ob){}
}
class gen3{
    static void test(gen2<? super D> ob){}

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        gen2<A> w1 = new gen2<A>(a);
        gen2<B> w2 = new gen2<B>(b);
        gen2<C> w3 = new gen2<C>(c);
        gen2<D> w4 = new gen2<D>(d);

        test(w1);
        test(w2);
        test(w3);
        test(w4);
    }
}
