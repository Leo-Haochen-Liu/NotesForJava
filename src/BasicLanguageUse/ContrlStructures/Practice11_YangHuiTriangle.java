package BasicLanguageUse.ContrlStructures;

public class Practice11_YangHuiTriangle {

    /*
    * I use two methods to complete the Yang Hui Triangle task
    *
    * The first method is rollOfYangHui, which input roll number, and return that roll
    * first two rolls are setting up, and from the third roll I use recursion
    *
    * The second method is printYangHui, which input toRoll(number),
    * and print all the numbers to that roll*/

    public static int[] rollOfYangHui(int rollNum) {
        int[] rollOfYangHui = new int[rollNum];
        if (rollNum == 1) {
            rollOfYangHui[0] = 1;
        }
        if (rollNum == 2) {
            rollOfYangHui = new int[]{1, 1};
        }
        if (rollNum >= 3) {
            rollOfYangHui[0] = 1;
            for (int i = 1; i < rollNum - 1; i++) {
                rollOfYangHui[i] = rollOfYangHui(rollNum - 1)[i] + rollOfYangHui(rollNum - 1)[i - 1];
            }
            rollOfYangHui[rollNum - 1] = 1;
        }
        return rollOfYangHui;
    }

    public static void printYangHui(int toRoll) {
        for (int i = 1; i <= toRoll; i++) {
            for (int j = 0; j < rollOfYangHui(i).length; j++) {
                System.out.printf("%d ", rollOfYangHui(i)[j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printYangHui(6);
    }
}
