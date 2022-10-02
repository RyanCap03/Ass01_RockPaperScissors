import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String playerA = "";
        String playerB = "";
        String play;


        do
        {
            System.out.print("PlayerA enter your move: ");
            if(in.hasNextLine())
            {
                playerA = in.nextLine();
            }
            else
            {
                System.out.println("Not a correct input");
            }

            System.out.print("PlayerB enter your move: ");
            if(in.hasNextLine())
            {
                playerB = in.nextLine();
            }
            else
            {
                System.out.println("Not a correct input");
            }


            if(playerA.equalsIgnoreCase("R"))
            {
                //playerB code crossed against the playerA Rock move
                if(playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock vs Rock Its's a Tie!");
                }
                else if(playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper covers Rock, player B Wins!");
                }
                else if (playerB.equalsIgnoreCase("S"))
                {
                    System.out.println("Rock breaks Scissors, player A wins!");
                }
                else
                {
                    System.out.println("That is not a correct input, Try Again");
                }

            }


            else if (playerA.equalsIgnoreCase("P"))
            {
                if(playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers Rock, player A wins!!");
                }
                else if(playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper vs Paper, its a tie!");
                }
                else if (playerB.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissors cut paper, player B wins");
                }
                else
                {
                    System.out.println("That is not a correct input, Try Again");
                }
            }


            else //scissors
            {
                if(playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock Breaks Scissors, Player B wins!");
                }
                else if(playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors cut paper, player A Wins!");
                }
                else if (playerB.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissors vs. Scissors, its a tie!");
                }
                else
                {
                    System.out.println("That is not a correct input, Try Again");
                }
            }
//----------------------------------------------------------------------------------
            System.out.println("would you like to play again? [Y/N]");
            play = in.nextLine();
            if(play.equalsIgnoreCase("N"))
            {
                System.out.println("");
            }
            else
            {
                System.out.println("");
            }
        }
        while (play.equalsIgnoreCase("Y"));
        {
            System.out.println("Thanks for playing");

        }


    }
}