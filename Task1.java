import java.util.Random;
import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100)+1; // it generate a number between 1-100.
        int maxChance = 8; // total life line (only 7 chance)
        int attempts =0;   // current attemps
        boolean playAgain = true;
        int finalScore =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("!! Hey Buddy , Welcome to the Number Game !!");
        System.out.println("Here are the rules of the Game:- Buddy, you will get " +maxChance+" life line , to win the Game");
        System.out.println("--------------------------------------------------------------------");

        while(playAgain){
            boolean guess=false;
            for(attempts= 1; attempts<=maxChance; ++attempts){
                System.out.println();
            System.out.println("chance  "+(attempts)+"  Enter your guess number: ");
            int userGuess = sc.nextInt();  

            // checking the user's guess number and random number is same or not .
            if(userGuess == randomNumber){
                System.out.println();
                guess = true ;
                finalScore++;
                System.out.println("!! Congratulation !!");
                System.out.println("you guessed the correct number :"+ randomNumber);
                break;
            }
            else if (userGuess<randomNumber){
                System.out.println("your guess is too low");
            }
            else if (userGuess>randomNumber){
                System.out.println("your guess is too high");
            }
            }

            if (guess == false){
                System.out.println("Sorry Buddy , you lost the chance. The correct number is :"+randomNumber);
            }
            System.out.println();
            System.out.println("do you want to play again: (Y/N) ");
            String pA = sc.next();
            playAgain = pA.equalsIgnoreCase("Y");

        }

        System.out.println("That's it Buddy , Hope you loved it ");
        System.out.println("Here is your score "+ finalScore);
        System.out.println();
    }
}