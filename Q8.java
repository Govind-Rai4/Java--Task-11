import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base (x): ");
        int x = scanner.nextInt();
        System.out.print("Enter the exponent (y): ");
        int y = scanner.nextInt();

        int result = 1;
        int count = 0;

        while (count < y) {
            result *= x;
            count++;
        }

        System.out.println(x + " raised to the power " + y + " is: " + result);
    }
}
