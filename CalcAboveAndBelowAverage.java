import java.util.*;

public class CalcAboveAndBelowAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in)
        int[] scores = new int[5];
        int numScores = 0;
        double total = 0;
        System.out.println("Enter the scores: ");
        for(int i = 0; i < 5; i++) {
            int score = input.nextInt();
            if(score < 0) {
                break;
            }
            scores[i] = score;
            numScores++;
            total += score;
        }
        double average = total / numScores;
        int aboveOrEqualCount = 0;
        int belowCount = 0;
        for(int i = 0; i < numScores; i++) {
            if(scores[i] >= average) {
                aboveOrEqualCount++;
            } 
            else {
                belowCount++;
            }
        }
        System.out.println("Number of scores above or equal to the average: " + aboveOrEqualCount);
        System.out.println("Number of scores below the average: " + belowCount);
    }
}