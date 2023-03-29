package lesson.OOPsem2;

public class numTest2 implements test{

    int start;
    int val;
    int prev;

    public numTest2() {
        start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public int getNext() {
        prev = val;
        val += 10;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
    }

    int getPrev(){
        return prev;
    }

}
