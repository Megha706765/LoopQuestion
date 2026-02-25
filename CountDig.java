
import java.util.Scanner;

class CountDig {

    public static void main(String[] args) {
        // a = 1234; dena hoga input me
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while (a != 0) {
            int rem = a % 10;

            count++;
            a = a / 10;
        }
        System.out.print(count);

    }
}
