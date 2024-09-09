/**
 *
 Write a short Java program that outputs all possible strings formed
 by using the characters 'c', 'a', 't', 'd', 'o', and 'g' exactly once.
 */
public class GeneratePermutations {

    // Recursive function to generate permutations, using recursive backtracking algorithm
    public static void generatePermutations(char[] array, int start, int end) {
        if (start == end) {
            // Print the current permutation
            System.out.println(String.valueOf(array));
        } else {
            for (int i = start; i <= end; i++) {
                // Swap the current element with the starting element
                swap(array, start, i);

                // Recursively generate permutations with the remaining elements
                generatePermutations(array, start + 1, end);

                // Backtrack: undo the swap
                swap(array, start, i);
            }
        }
    }

    // Helper function to swap two elements in the array
    public static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}


