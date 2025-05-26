import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while (n>1){
            fact *= n--;
        }
        System.out.println("Factorial = "+ fact);
        scanner.close();
    }
}
