/**
 * Utility class that provides a method to sum all integers less than or equal n.
 *
 * Question addressed: Write a short Java method that takes an integer n
 * and returns the sum of all the odd positive integers less than or equal to n.
 */
public class SumOfAllIntegersLessEqualN {

    /**
     * Calculates the sum of all integers smaller or equal than n.
     * @param n input parameter provided for calculation
     * @return result of calculation
     */
    public static int sumOfAllIntegersLessEqualN(int n){
        int sum=0;
        for (int i=1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

}
