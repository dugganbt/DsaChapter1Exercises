/**
 * Utility class that provides a method to sum all odd integers less than or equal n.
 *
 * Question addressed: Write a short Java method that takes an integer n
 * and returns the sum of all the odd positive integers less than or equal to n.
 */
public class SumOddPositiveIntegersLessEqual {

    /**
     * Calculates sum of all odd integers less than or equal to n
     * @param n int to calculate the sum of all odd integers of
     * @return result of calculation.
     */
    public static int sumOddPositiveIntegersLessEqual(int n){
        int sum = 0;

        for (int i = 1; i <= n; i++){
            //Check if i is odd using previously written function
            if (!IsEven.isEven(i)){
                sum += i;
            }
        }

        return sum;
    }
}
