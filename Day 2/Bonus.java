import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int rev = 0; // reverse number
        int sum = 0; // sum of digits
        while (n > 0){
            int digit = n % 10;
            rev = rev*10 + digit;
            sum += digit;
            n /= 10;
        }
        System.out.println("Reverse Number: "+rev);
        System.out.println("Sum of digits: "+ sum);
        scanner.close();
    }    
}
