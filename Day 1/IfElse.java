import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int score = scanner.nextInt(); // read next integer from user input

        // Printing grade based on marks
        if (90 <= score && score <= 100)
            System.out.println("A");
        else if (80 <= score && score < 90)
            System.out.println("B");
        else if (70 <= score && score < 80)
            System.out.println("C");
        else if (60 <= score && score < 70)
            System.out.println("D");
        else
            System.out.println("F");
        scanner.close(); // closing the scanner
    }
}
