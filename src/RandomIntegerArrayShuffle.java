import java.util.Random;

/**
 * Write a Java method that takes an array containing the set of all integers in the range 1 to 52 and
 * shuffles it into random order. Your method should output each possible order with equal probability.
 */
public class RandomIntegerArrayShuffle {

    /**
     * Randomly shuffles an integer array, where each shuffling result has equal probability.
     * Uses the Fisher-Yates shuffle algorithm.
     * @param integerArray int[] array to be shuffled
     * @return shuffled array
     */
    public static int[] randomIntegerArrayShuffle(int[] integerArray){

        Random random = new Random();

        //Fisher-Yates Shuffle algorithm
        for (int i = integerArray.length-1; i>0; i--){

            //nextInt gets a random integer between 0 (inclusive) and i (exclusive)
            int j = random.nextInt(i + 1);

            //swap elements at i and j
            int temp = integerArray[i];
            integerArray[i] = integerArray[j];
            integerArray[j] = temp;

        }
        return integerArray;
    }

}
