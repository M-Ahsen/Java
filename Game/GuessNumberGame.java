import java.util.Random;
import java.util.Scanner;

class Game {
    int input;
    int totalAttempts;
    int guess;

    Game() {
        Random rand = new Random();
        guess = rand.nextInt(1000); 
    }

    public void input() {
        System.out.print("Enter a digit between 1-1000: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
    }

    public boolean checkGuess() {
        System.out.println(guess);
        totalAttempts++;
        if(input == guess) {
            System.out.format("Congratulation You Win\nTotal Attempts = %d\n",totalAttempts);
            return true;
        }
        else if(input<guess)
        System.out.println("Input number is too low");
        else 
        System.out.println("Input number is to high");

        return false;
    }
}

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String playAgain;
        while(true) {
        Game game = new Game();
        boolean check = false;
            while(!check) {
                game.input();
                check = game.checkGuess();
            } 
        System.out.println("You want to Play again (yes/no)");
        playAgain = sc.next();
        if(playAgain.equalsIgnoreCase("no")){
            break;}
        }
    }
}