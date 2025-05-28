package Day3;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0; i<10; i++){
            System.out.print("Enter Num: ");
            nums[i] = sc.nextInt();
            max = (nums[i] > max) ? nums[i] : max;
        }

        System.out.println("User Input array is:");
        for(int num: nums)
            System.out.print(num + " ");

        System.out.printf("\nThe max Value from user input is: %d\n", max);
        sc.close();
    }

}
