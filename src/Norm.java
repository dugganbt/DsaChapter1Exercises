/**
 * The {@code Norm} class provides methods to calculate the p-norm of a vector
 * and the Euclidean norm (which is the special case where p = 2).
 */
public class Norm {

    /**
     * Calculates the P norm, given a vector doubleArray, and a p value
     * @param doubleArray vector on which to calculate the P norm
     * @return P norm
     */
    public static double norm(double[] doubleArray, double p){
        double sum = 0.0;

        // Calculate the sum of each element raised to the power of p
        for (double v : doubleArray) {
            sum += Math.pow(v, p);
        }

        // Return the p-th root of the sum
        return Math.pow(sum, 1.0 / p);
    }

    /**
     * Calculates the Euclidean norm, where p is 2, when no p value is provided
     * @param doubleArray vector on which to calculate the eculidean norm
     * @return euclidean norm
     */
    public static double norm(double[] doubleArray){
        double sum = 0.0;

        // Calculate the sum of each element raised to the power of p
        for (double v : doubleArray) {
            sum += Math.pow(v, 2);
        }

        // Return the p-th root of the sum
        return Math.pow(sum, 1.0 / 2);
    }




}
