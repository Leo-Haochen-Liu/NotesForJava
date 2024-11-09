package BasicLanguageUse.ContrlStructures;

import java.util.Scanner;

public class Practice2_LeapYear {
    /*
     * If a year is divisible by 4 but not by 100,
     * or if it is divisible by 400, it is a leap year.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println(true);
        else System.out.println(false);
    }
}
