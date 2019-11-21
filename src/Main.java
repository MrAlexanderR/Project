import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i, mas = 0;
        Scanner scan = new Scanner(System.in);
        String str;
        String[] strokaIn;
        String[] strokaOut;
        strokaIn = new String[9];

        do {
            System.out.println("Enter the string (0 and 1) ");
            str = scan.nextLine();
            mas = 0;
            if (str.length() == 9) {
                for (i = 0; i < 9; i++) {
                    if ((str.charAt(i) == '1') || (str.charAt(i) == '0')) {
                        mas++;
                    }
                }
            }
        } while ((str.length() != 9) || (mas != 9));

        System.out.println("Enter an array of strings");
        for (i = 0; i < 9; i++) {
            strokaIn[i] = scan.nextLine();
            if (str.charAt(i) == '1') {
                mas++;
            }
        }

        strokaOut = new String[mas];
        mas = 0;
        for (i = 0; i < 9; i++) {
            if (str.charAt(i) == '1') {
                strokaOut[mas] = strokaIn[i];
                mas++;
            }
        }

        System.out.println("Output array:");
        for (i = 0; i < mas; i++) {
            System.out.println(strokaOut[i]);
        }
    }
}