public class PrimeNumberChecker {
    public static void main(String[] args) {
        int number = 29;
        boolean isPrime = true;
        for(int i = 2; i <= number/2; i++) {
            if(number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(number + " is a prime number");
        else
            System.out.println(number + " is not a prime number");
    }
}

/*
public class PrimeNumber {  
    public static void main(String[] args) { 
        int n = 37; 
        if (isPrime(n)) 
            System.out.println(n + " is a prime number"); 
        else
            System.out.println(n + " is not a prime number"); 
    } 
  
    // Function to check prime number 
    public static boolean isPrime(int n) { 
        // Corner case 
        if (n <= 1) 
            return false;   
        // Check from 2 to the square root of n 
        for (int i = 2; i <= Math.sqrt(n); i++) 
            if (n % i == 0) 
                return false;   
        return true; 
    } 
} 
*/