/**
 * Utility class that provides a method to calculate the sum of all integers less than or equal to n-
 *
 * Question addressed: Write a short Java method that takes an integer n
 * and returns the sum of the squares of all positive integers less than or equal to n.
 */
public class SumOfSquaresLessEqualN {

    public static int sumOfSquaresLessEqualN(int n){

        int sum = 0;

        for(int i = 1; i <=n; i++){
            sum += i*i;
        }

        return sum;

    }
}
