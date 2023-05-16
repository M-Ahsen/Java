import java.util.Arrays;

public class SortString {
   public static void main(String[] args) {
      // String[] fruits = new String[] {"pineapple", "apple", "orange", "banana"};
      String[] fruits = {"pineapple", "apple","apple", "orange", "banana"};
      Arrays.sort(fruits);
      int i=1;
      for(String temp: fruits){
         System.out.println("fruits " + i++ + " : " + temp);
      }
   }
}