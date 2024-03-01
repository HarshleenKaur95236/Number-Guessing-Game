import java.util.*;
import java.util.Random;

public class Main {
    private static final int MIN_RANGE=1;
    private static final int MAX_RANGE=100;
    private static final int MAX_ATTEMPTS =10;
    private static final int Rounds =3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random obj = new Random();
        int totalScore = 0;
        System.out.println("NUMBER GUESSING GAME");
        System.out.printf("No of Rounds is: %d\n", Rounds);
        System.out.printf("Maximum attempts you can do in one round is: %d\n", MAX_ATTEMPTS);

        for(int i=1; i<=Rounds; i++){
            int num = obj.nextInt(MAX_RANGE) + MIN_RANGE;
            int attempts = 0;
            System.out.println("Round No.: " + i);
            System.out.printf("Enter any number between %d and %d\n", MIN_RANGE, MAX_RANGE);

            while (attempts < MAX_ATTEMPTS){
                System.out.print("Guess any number: ");
                int guess_num = sc.nextInt();
                attempts = attempts + 1;
                if(num < guess_num) {
                    System.out.printf("The number is smaller than %d. Attempts done= %d\n", guess_num, attempts);
                }else if(num > guess_num) {
                    System.out.printf("The number is greater than %d. Attempts done= %d\n", guess_num, attempts);
                }else {
                    int score = MAX_ATTEMPTS - attempts;
                    totalScore = totalScore + score;
                    System.out.printf("Congratulations, You guessed the number successfully. Attempts= %d, Score= %d.\n", attempts, score);
                    System.out.println();
                    break;
                }
            }

            if(attempts == MAX_ATTEMPTS){
                System.out.print("You Lose the Game.");
                System.out.printf("The number is: %d\n", num);
                System.out.println();
            }

        }
        System.out.printf("Game finished. Your totalScore is: %d\n\n", totalScore);
        sc.close();
    }
}