import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        long sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = scanner.nextLong();

        for (int i =1; i<=n; i++){
            sum += i;
        }
        System.out.println("Sum = "+sum);
        scanner.close();
    }    
}
