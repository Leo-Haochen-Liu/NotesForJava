package BasicLanguageUse.recursion;

public class monkeyEatPeaches {

    // 递归转化成for循环 recursion into for loop
    public static int findTotal(int days) {
        int total = 1;
        for (int i = days; i > 1; i--) {
            total = (total + 1) * 2;
        }
        return total;
    }

    // 递归 recursion
    public static int total(int days) {
        if (days == 1) return 1;
        return (total(days - 1) + 1) * 2;
    }

    public static void main(String[] args) {
        System.out.println(findTotal(10));
        System.out.println(total(10));
//        test if it can be pulled or pushed
    }
}
