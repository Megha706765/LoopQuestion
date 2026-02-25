
import java.util.Scanner;

class Question_4 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //row
        for (int row = 1; row <= n; row++) {
            //column
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //row change
        for (int row = n - 1; row >= 1; row--) {
            //column
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
