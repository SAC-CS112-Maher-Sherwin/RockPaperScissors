package rockpaperscissors;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        String PlayerChoice;
        String OpponentChoice = "R";
        int OpponentNumber;
        String PlayAgain = "Y";
        Scanner input = new Scanner(System.in);
        Random generate = new Random();
        
        System.out.println("Let's play Rock, Paper, Scissors. ");
        
        while (PlayAgain.equals("Y")){
            
            System.out.println("\nWhat is your choice? (Rock = R, Paper = P, Scissors = S)");
            PlayerChoice = input.next(); //Receive input from user on what move they pick (R, P, or S)
        
            OpponentNumber = generate.nextInt(3)+1; //Randomly generate 1, 2 or 3 for Opponent
            if (OpponentNumber == 1) 
                OpponentChoice = "R"; // If 1 is generated, set opponent's choice to Rock
            else if (OpponentNumber == 2)
                OpponentChoice = "P"; // If 2 is generated, set opponent's choice to Paper
            else if (OpponentNumber == 3)
                OpponentChoice = "S"; // If 3 is generated, set opponent's choice to Scissors
            
            System.out.println("I picked " + OpponentChoice);            
        
            if (PlayerChoice.equals(OpponentChoice))
                System.out.println("It looks like a tie. No one wins!");
            else if (PlayerChoice.equals("R")){
                if (OpponentChoice.equals("S"))
                    System.out.println("Nooo! Your Rock crushed my Scissors. You win!");
                else if (OpponentChoice.equals("P"))
                    System.out.println("My Paper covers your Rock. You lose!");
            }
            else if (PlayerChoice.equals("P")){
                if (OpponentChoice.equals("R"))
                    System.out.println("Ahh! Your Paper covers my Rock. You win!");
                else if (OpponentChoice.equals("S"))
                    System.out.println("My Scissors cuts your paper! I win!");
            }
            else if (PlayerChoice.equals("S")){
                if (OpponentChoice.equals("R"))
                    System.out.println("Sorry! My Rock crushes your Scissors. You lose!");
                else if (OpponentChoice.equals("P"))
                    System.out.println("Woah! Your Scissors cut my Paper. You win!");
            }
            
            System.out.println("\nWould you like to play again? \n(Yes = Y, No = N)");
                PlayAgain = input.next();           
        }
        
        System.out.println("Thanks for playing. Play again soon!");
    
    }
}
