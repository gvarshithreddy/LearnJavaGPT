package Day3;

import java.util.Scanner;

public class NumInput{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i =0; i<5; i++){
            System.out.print("Enter a number: ");
            nums[i] = sc.nextInt();

        }
        System.out.println("The input array is: ");

        for(int j = 0; j<5; j++)
            System.out.print((j<4) ? nums[j]+", ": nums[j]);
        System.out.println("");
        sc.close();           

    }
}