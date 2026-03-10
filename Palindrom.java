
import java.util.Scanner;

class Palindrom {

    public static void main(String[] args) {
        //n = 123321; ya n=12321;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int pal = 0;
        while (n != 0) {
            int rem = n % 10;
            pal = pal * 10 + rem;
            n = n / 10;
        }
        if (original == pal) {
            System.out.print("Number is Palindrom");
        } else {
            System.out.print("not a Palindrom");
        }

    }
}
