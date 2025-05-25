import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in degrees Celcius:");
        int celcius = scanner.nextInt();
        double farenheit = (celcius * 9/5) + 32;
        System.out.println("Temperature in farenheit: " + farenheit + " °F");
        scanner.close();
        return;

    }
}
