
public class NumberManipulator
{
    // private instance variables
    // int for the number (num)
    // int for the number of times manipulated (timesRun)
    // boolean for whether or not program should keep running (running)
    

    /**
     * Constructor
     *
     * @param int that for number
     */
    
    // your implementation...



    /**
     * isRunning
     *
     * @param none
     * @return value of running variable
     */

    // your implementation...



    /**
     * getTimesRun
     *
     * @param none
     * @return value of timesRun variable
     */
    
    // your implementation...



    /**
     * getReverse
     *
     * @param none
     * @return num reversed as an int
     */
    
    // your implementation...



    /**
     * getDigitSum
     *
     * @param none
     * @return sum of digits of num as an int
     */
    
    // your implementation...



    /**
     * getNthDigit
     *
     * @param digit desired, as an int
     * @return nth digit in num, as an int
     *
     * n must be positive and less than or equal to length of num
     */
    
    // your implementation...

    
    
    /**
     * stop
     *
     * @param none
     * @return none
     *
     * running is set to false
     */
    
    // your implementation...


    
    /**
     * runCompleted
     *
     * @param none
     * @return none
     *
     * timesRun is incremented by 1
     */

    // your implementation



    /**
     * changeNum
     *
     * @param value of new number as int
     * @return none
     *
     * num is changed to newNum
     * timesRunning is reset to 0
     */
        
    // your implementation...



    /** DO NOT EDIT BELOW HERE */

    /**
     * getNumDigits (private)
     *
     * @param none
     * @return returns the length of num, as an int
     */
    private int getNumDigits()
    {
        int exp = 0;

        while(num / (int) Math.pow(10, exp) > 0)
        {
            exp++;
        }

        return exp;
    }
}

