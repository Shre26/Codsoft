import java.util.Random;
import java.util.Scanner;
                                // TASK 1 : NUMBER GAME
class Game{
    public int n;
    public int userInputNumber;
    public int noOfGuesses=0;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    }

    Game(){
        Random r = new Random();
        this.n = r.nextInt(100);
    }

    void TakeInput(){
        System.out.print("Enter your no:");
        Scanner sc= new Scanner(System.in);
        userInputNumber=sc.nextInt();
    }
    boolean checkCorrectNumber(){
        noOfGuesses++;
        if(userInputNumber==n){
            System.out.format("Yes!You guessed the number\nYou guessed it in %d attempts",noOfGuesses);
            return true;
        }
        else if(userInputNumber<n){
            System.out.println("It's too low...");
        }
        else if (userInputNumber>n){
            System.out.println("It's too high...");
        }
        return false;
    }
}

public class NumberGame {
    public static void main(String[]args){
        System.out.println("------------------------------------Let's start the game-----------------------------------------------");
        System.out.println();
        Game g = new Game();
        boolean b= false;
        while(!b){
            g.TakeInput();
            b=g.checkCorrectNumber();
        }
        System.out.println();
        System.out.println("\nThank You for playing & i hope you enjoyed it.");
    }
}
