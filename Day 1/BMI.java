import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);

        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (18.5 <= bmi && bmi <= 24.9)
            System.out.println("Normal");
        else if (25<= bmi && bmi <= 29.9)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
        
            scanner.close();
    }    
}
