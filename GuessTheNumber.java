import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber
{
    public static void main(String args[])
    {
        int randomvalue;

        int uservalue;

        boolean gameresult;

        String userchoice;

        Random ran = new Random();

        Scanner input = new Scanner(System.in);

        do
        {
            randomvalue = getrandomnumber(ran);

            System.out.println("\n Guess the Number");
            System.out.println("A random number between 1 and 1000.");

            do
                {
                    uservalue = getusernumber(input);

                    gameresult = playguessinggame(randomvalue, uservalue);
            }while(gameresult != true);
            System.out.print("\n Enter yes to repeat the game:");
            userchoice = input.next();
            System.out.println();
        }while(userchoice.equals("Yes") || userchoice.equals("yes"));
    }

    public static int getrandomnumber(Random random)
    {
        int number;

        number = 1+random.nextInt(1000);

        return number;
    }

    public static int getusernumber(Scanner input)
    {
        int number;

        System.out.print("\n Guess the number between 1 and 1000:");
        number = input.nextInt();
        return number;
    }

    public static boolean playguessinggame(int randomnumber, int usernumber)
    {
        if(usernumber < randomnumber)
        {
            System.out.print(usernumber + " is too low. Try again!");
            return false;
        }
        else if(usernumber > randomnumber)
        {
            System.out.println(usernumber + " is too high. Try gain");
            return false;
        }
        else
        {
            System.out.println("\n Congratulations. " + "You guessed the number " + "correctly!");
            return true;
        }
    }
}
