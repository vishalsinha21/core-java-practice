package vs.test;

public class TestCaseWithMultipleValues {
    public static void main(String[] args) {
        System.out.println(getNum(0));
        System.out.println(getNum(1));
        System.out.println(getNum(2));
    }

    private static int getNum(int index) {
        switch (index) {
            case 0:
            case 1:
                return index;
            default:
                return -1;
        }
    }
}
