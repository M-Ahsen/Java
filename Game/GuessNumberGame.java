import java.util.Random;
import java.util.Scanner;

class Game {
    int input;
    int totalAttempts;
    int guess;

    Game() {
        Random rand = new Random();
        guess = rand.nextInt(100); 
    }

    public void input() {
        System.out.print("Enter a digit between 0-100: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
    }

    public boolean checkGuess() {
        totalAttempts++;
        if(input == guess) {
            System.out.format("Congratulation You Win\nTotal Attempts = %d\n",totalAttempts);
            return true;
        }
        else if(input<guess)
        System.out.println("Input number is small");
        else 
        System.out.println("Input number is large");

        return false;
    }
}

public class GuessNumberGame {
    public static void main(String[] args) {
        Game game = new Game();
        boolean check = false;
        while(!check) {
            game.input();
            check = game.checkGuess();
        } 
    }
}