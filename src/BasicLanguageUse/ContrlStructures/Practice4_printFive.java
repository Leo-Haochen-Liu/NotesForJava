package BasicLanguageUse.ContrlStructures;

public class Practice4_printFive {
    /*
     * print every number that can't be divided by 5 from 1-100
     * print 5 number every line*/

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (count == 5) {
                System.out.println(" ");
                count = 0;
            }
            if (i % 5 != 0) {
                count++;
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
