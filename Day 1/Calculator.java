import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        
        System.out.println("Enter operand 1:");
        int operand1 = scanner.nextInt();
        System.out.println("Enter operand 2:");
        int operand2 = scanner.nextInt();
        System.out.println("Enter operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);
        int result = 0;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0)
                    result = operand1 / operand2;
                else{
                    scanner.close();
                    throw new Error("Can't divide by 0");

                }
                    
                break;
            default:
                System.out.println("Not a valid opertor");
                scanner.close();
                return;
            
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}
