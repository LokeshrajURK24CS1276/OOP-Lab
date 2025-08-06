
import java.util.Scanner;

import java.util.Random;
public class q4{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100) + 1; 
        int guess;
        
        System.out.println("Guess a number between 1 and 100");
        int guesses_rem = 6;
        int attempt = 0;

        while(attempt<6){
        	System.out.print("Enter your guess:");
        	guess = sc.nextInt();
        	attempt++;
        	guesses_rem--;
        	
        if(guess > num){

            System.out.println("Too High!");
        }
        else if(guess < num){
        	System.out.println("Too Low!");
        }
        else {
        	System.out.println("Correct Guess!");
        	}
        System.out.println("Number of guess remaining:"+guesses_rem);
        }
        System.out.println("Out of guesses,Game Over!");
    }

}