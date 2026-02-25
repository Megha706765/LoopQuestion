
import java.util.Scanner;

class ProductOfDigits {

    public static void main(String[] args) {
        // n = 1234;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        while (n != 0) {
            int rem = n % 10;
            product = product * rem;
            n = n / 10;
        }
        System.out.print(product);
    }
}
