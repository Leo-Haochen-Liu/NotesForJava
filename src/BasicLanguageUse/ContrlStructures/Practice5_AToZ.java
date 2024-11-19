package BasicLanguageUse.ContrlStructures;

public class Practice5_AToZ {

    /*
     * print out a-z and A-Z
     * */

    /*
     * create an array to restore 'A'-'Z'.
     * then use for loop to print them out
     * */

    public static void main(String[] args) {

        // 10个一行打印a-z
        int count = 0;
        for (int i = 97; i <= 122; i++) {
            if (count == 10) {
                System.out.println("");
                count = 0;
            }
            System.out.print((char) i);
            count++;
        }

        // 10个一行打印A-Z
        count = 0;
        System.out.println("\n");

        for (int i = 65; i <= 90; i++) {
            if (count == 10) {
                System.out.println("");
                count = 0;
            }
            System.out.print((char) i);
            count++;
        }

        // A-Z数组存储并打印
        count = 0;
        System.out.println("\n");

        char[] AToZ = new char[26];
        for (int i = 0; i < 26; i++) {
            AToZ[i] = (char) ('A' + i);
        }
        for (int i = 0; i < 26; i++) {
            if (count == 10) {
                System.out.println("");
                count = 0;
            }
            System.out.print(AToZ[i]);
            count++;
        }
    }
}
