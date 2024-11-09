package BasicLanguageUse.ContrlStructures;

public class Practice3_NarcissisticNumber {
    /*
     * A Narcissistic Number, also known as an Armstrong Number,
     * is an n-digit number that is equal to the sum
     * of its digits each raised to the power of n.
     * For example, for a three-digit number,
     * if the sum of each digit raised to the power
     * of three equals the number itself,
     * it is a Narcissistic Number.
     *
     * 题目要求：寻找所有3位数中的水仙花数*/

    /* 例子：
     * 153 is a Narcissistic Number because 1^3 + 5^3 + 3^3 = 153
     * 370 is a Narcissistic Number because 3^3 + 7^3 + 0^3 = 370*/

    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int UnitsPlace = i % 10; // 个位
            int TensPlace = i % 100 / 10; // 十位
            int HundredsPlace = i / 100; // 百位
            if (Math.pow(HundredsPlace,3) + Math.pow(TensPlace, 3) + Math.pow(UnitsPlace, 3) == i){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
