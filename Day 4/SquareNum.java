public class SquareNum{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        for (int num : nums){
            System.out.println(square(num));
            System.out.println(evenOdd(num));
        }
        print5Times("Zondy");
    }

    public static int square(int a){return a*a;}
    public static String evenOdd(int a){return (a%2==0) ? "Even" : "Odd";}
    public static void print5Times(String name){
        for(int i= 0; i<5; i++)
            System.out.println(name);
    }
}