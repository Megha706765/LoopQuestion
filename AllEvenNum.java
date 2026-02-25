
import java.util.Scanner;

class AllEvenNum {

    public static void main(String[] args) {
        // n = 25; bhi dal sakte hai
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
