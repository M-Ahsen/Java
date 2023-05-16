import java.util.Arrays;

public class SortStringCharactor {
    public static String sort(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
    
    public static void main(String[] args) {
        String s = "bac";      
        System.out.println(sort(s));
    }
}
