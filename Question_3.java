
import java.util.Scanner;

class Question_3 {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        number = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (number % 2 != 0) {
                System.out.print(number + " number is odd");
                break;
            } else {
                System.out.print(number + " number is even");
                break;
            }
        }
    }
}
