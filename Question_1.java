
import java.util.Scanner;

class Question_1 {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = sc.nextInt();
        for (int i = 2; i <= number; i++) {
            if (number % 1 == 0 && number % i == 0) {
                System.out.print(number + " is not a prime ");
                break;
            } else {
                System.out.print(number + " is a prime");
                break;
            }
        }
    }
}
