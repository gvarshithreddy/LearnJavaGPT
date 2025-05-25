import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);

        int p = scanner.nextInt();
        double r = scanner.nextDouble();
        int t = scanner.nextInt();

        double si = (p * r * t) / 100;

        System.out.printf("The SImple Interest is: %.2f\n", si);
        scanner.close();
    }  
}
