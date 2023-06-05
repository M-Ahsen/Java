import java.util.Scanner;
class Task2 {
    public static void main(String[] args) {
    String num;
    double check;
    Scanner obj = new Scanner(System.in);
    num = obj.next();
    try{
        check = Double.parseDouble(num);
        System.out.println("Answe: " + check);
    }
    catch(NumberFormatException e){
        check = 0;
        System.out.println(check);
        System.out.println(e);
    }
    }
}