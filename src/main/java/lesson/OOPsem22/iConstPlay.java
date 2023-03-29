package lesson.OOPsem22;

public class iConstPlay implements iConst {
    public static void main(String[] args) {
        int nums[] = new int[MAX];
        for (int i = MIN; i < 11; i++) {
            if (i >= MAX) {
                System.out.println(error);
            } else {
                nums[i] = i;
                System.out.println(nums[i] + " ");
            }
        }
    }
}
