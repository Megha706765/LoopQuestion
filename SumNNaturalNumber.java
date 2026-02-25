
import java.util.Scanner;

class SumNNaturalNumber {

    public static void main(String[] args) {
        // n=1234;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.print(sum);
    }
}
