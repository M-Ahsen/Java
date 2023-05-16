import java.util.Scanner;
class Pattern_Using_Recursion {
    public static void pattern(int x) {
        if(x==0)
        return;
        for(int i=0; i<x; i++)
        System.out.print("* ");
        System.out.println();
        pattern(x-1);        
    }
 
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = obj.nextInt();
    pattern(num);
    }

}