import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner("1 2 3 4 5 6 7");

        int[] nums = new int[6];
        int[] rev = new int[6];
        for (int i = 0; i < 6; i++)
            nums[i] = sc.nextInt();
        System.out.println("Original Array:");
        for (int n: nums){
            System.out.print(n +" ");
        }
        for(int j = nums.length-1; j>=00; j--)
            rev[j] = nums[nums.length - j -1];
        System.out.println("\nReversed Array");
        for (int n: rev)
            System.out.print(n +" ");
        System.out.print("\n");
        sc.close();
    }
}
