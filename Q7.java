import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (N) for the Fibonacci series: ");
        int n = scanner.nextInt();
        int first = 0, second = 1, count = 0;

        System.out.println("Fibonacci series up to " + n + " terms:");
        while (count < n) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            count++;
        }
    }
}
