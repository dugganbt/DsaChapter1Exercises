/**
 * Question addressed: Write a short Java method,isEven,thattakesanintiandreturnstrueifandonly if i is even.
 * Your method cannot use the multiplication, modulus, or division operators, however.
 */
public class IsEven {

    /**
     * Algorithm that checks if i is even.
     * <p>
     * Let j equal i. If j equal 1, then i is uneven. If j equals 0, then i is even.
     * If neither are true, reduce j by two, and repeat until j is either 1 or 0.
     * Then return the equality comparison with 0.
     *
     * @param i integer to check if even, or uneven.
     * @return true if integer is even, false if integer is uneven
     */
    public static boolean isEven(int i){
        int j = Math.abs(i);

        // Handle the base cases
        if (j == 0) {
            return true;  // 0 is considered even
        }
        if (j == 1) {
            return false;  // 1 is considered odd
        }

        // Reduce the value of j until it hits 0 or 1
        while (j > 1) {
            j -= 2;
        }

        // If j ends up at 0, it's even; if it ends up at 1, it's odd
        return j == 0;
    }
}
