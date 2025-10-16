import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();

        int loBound=1;
        int upBound=100;
        int randomNumber=ran.nextInt(upBound-loBound +1)+loBound;
        int numberofTrices=0;
        int guess;
        boolean hasGuess=false;
        System.out.println("Welcome to the game!");
        System.out.println("genreted the number "+loBound + "and "+ upBound+" . ");
        System.out.println("tr to guess to the number");
        while(!hasGuess){
            System.out.print("Enter the number: ");
            guess=sc.nextInt();
            numberofTrices++;
            if(guess<loBound||guess<upBound) {
                System.out.println("Your guess is not of bound.please guess another number " +loBound + "and " + upBound + " . ");
            } else if (guess>randomNumber) {
                System.out.println("Try again");
                
            } else if (guess<randomNumber) {
                System.out.println("Try again");
            }else {
                hasGuess=true;
                System.out.println("Done"+randomNumber+"in" + numberofTrices+ "tries");

        }
        }


    }
}
