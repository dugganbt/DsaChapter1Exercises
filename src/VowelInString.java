/**
 * Utility class that provides a method to count vowels in a string
 *
 * Question addressed: Write a short Java method that counts the number of vowels in a given character string.
 */
public class VowelInString {

    /**
     * Function that counts vowels in a string
     * @param s string provided to the function
     * @return int count of the number of vowels
     */
    public static int countVowelsInString(String s) {

        int vowelCount = 0;
        String vowels = "aeiouAEIOU";  // Handles both lowercase and uppercase vowels

        for (char letter : s.toCharArray()) {
            if (vowels.indexOf(letter) != -1) {  // Check if the letter is in the vowel list
                vowelCount++;
            }
        }

        return vowelCount;
    }

}
