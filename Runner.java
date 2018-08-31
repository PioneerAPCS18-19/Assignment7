
import java.util.Scanner;
import java.util.InputMismatchException;

public class Runner
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("\n\n\nWelcome to the Number Manipulator program!");
        System.out.print("Enter an integer: ");
        int num = in.nextInt();
        
        NumberManipulator numberManip = new NumberManipulator(num);

        while(numberManip.isRunning())  // keep running as long as user wants
        {
            System.out.print("Enter '1' to reverse, '2' for sum, '3' for a digit: ");
            int choice = getInput();
            int value = manipulate(numberManip, choice);
            numberManip.runCompleted();
            System.out.println("Your value is " + value);
            System.out.println("You have manipulated " + numberManip.getNumber() + " a total of " + numberManip.getTimesRun() + " times.");
            boolean run = checkToKeepGoing(numberManip);

            if(run)
            {
                askForChange(numberManip);
            }
        }

        in.close();
    }


    /* DO NOT EDIT BELOW HERE */

    /**
     * @param none
     * @return returns choice for task
     */
    public static int getInput()
    {
        Scanner in = new Scanner(System.in);
        int choice = -1;
        int[] choices = {1, 2, 3};

        try
        {
            choice = in.nextInt();
        }
        catch(Exception e)
        {
            System.out.print("Why? Please enter an integer: ");  
            getInput();
        }

        if(!isValidChoice(choice, choices))
        {
            getInput();
        }

        return choice;
    }

    /**
     * @param choice that was input as int, array with list of valid choices
     * @return true if choice is valid, false otherwise
     */
    public static boolean isValidChoice(int n, int[] choices)
    {
        for(int i = 0; i < choices.length; i++)
        {
            if(n == choices[i])
            {
                return true;
            }
        }

        return false;
    }

    /**
     * @param NumberManipulator object, choice entered by user as int
     * @return final value of number after being manipulated as int
     */
    public static int manipulate(NumberManipulator n, int choice)
    {
        if(choice == 1)
        {
            return n.getReverse();
        }

        else if(choice == 2)
        {
            return n.getDigitSum();
        }
        else if(choice == 3)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Which digit do you want? ");
            int digit = in.nextInt(); 

            return n.getNthDigit(digit);
        }
        else
        {
            return Integer.MIN_VALUE;
        }
    }

    /**
     * @param NumberManipulator object
     * @return runs stop() and returns false if user wants to stop program, returns true otherwise
     */
    public static boolean checkToKeepGoing(NumberManipulator n)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Would you like to keep going? (y/N) ");
        String ans = "";
        ans = in.next(); 

        if(ans.equals("") || ans.equalsIgnoreCase("n"))
        {
            n.stop();
            return false;
        }

        return true;
    }

    /**
     * askForChange
     *
     * @param NumberManipulator object
     * @return none
     *
     * number is changed if desired.
     */
    public static void askForChange(NumberManipulator n)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Would you like to change your number? (y/N) ");
        String ans = in.next();

        if(ans.equalsIgnoreCase("y"))
        {
            System.out.print("Enter a new integer: ");
            n.changeNum(in.nextInt());
        }
    }
}

