package lesson.OOPsem2;

public class numtest implements test{

    int start;
    int val;
    int prev;

    public numtest() {
        start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public int getNext() {
        prev = val;
        val += 2;
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
