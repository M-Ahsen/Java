public class SwapThreeNumbers {
    public static void main(String[] args) {
        int A = 5;
        int B = 10;
        int C = 15;

        System.out.println("Before Swap:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C);

        A = C;
        B = A-B;
        C = A-B;

        System.out.println("After Swap:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C);
    }
}
