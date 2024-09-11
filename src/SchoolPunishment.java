import java.util.Random;
/**
 * A common punishment for school children is to write out a sentence multiple times.
 * Write a Java stand-alone program that will write out the following sen- tence one hundred times:
 * “I will never spam my friends again.” Your program should number each of the sentences
 * and it should make eight different random- looking typos.
 */
public class SchoolPunishment {

    /**
     * Writes out a given string n number of times, with 8 random typos (1 max per line).
     * @param s string to write out n times
     * @param times amount of times to write out the string, with 8 random typos
     */
    public static void writeSchoolPunishment(String s, int times){

        int[] randomLines = new int[8]; //integer array holding the lines on which errors are printed
        Random random = new Random();

        //fill the array with random lines between 1 and 100 (inclusive)
        for (int i = 0; i < randomLines.length; i++) {
            randomLines[i] = random.nextInt(100) + 1;  // Generates random integers between 1 and 100
            System.out.println("random line: " + randomLines[i]); //print out the lines to confirm
        }


        for (int i=1; i<=times; i++){
            if(integerInArray(i,randomLines)){
                System.out.println(i + ": "+ addRandomTypo(s));
            }else{
                System.out.println(i + ": "+ s);
            }

        }
    }

    /**
     * Helper function that checks whether an integer is in an integer array
     * @param n integer to check
     * @param array integer array to assess
     * @return true, if integer is in array; false, otherwise
     */
    private static boolean integerInArray(int n, int[] array){

        boolean inArray = false;

        for (int i : array){
            if (n == i){
                inArray = true;
            }
        }
        return inArray;
    }

    /**
     * Adds a random typo to a random position within a string
     * @param s string to add the typo to
     * @return string with added typo
     */
    private static String addRandomTypo(String s) {
        Random random = new Random();
        int randomIndex = random.nextInt(s.length()) + 1;

        StringBuilder sb = new StringBuilder(s);

        // Replace the character at randomIndex with a random lowercase letter
        sb.setCharAt(randomIndex, (char) (random.nextInt(26) + 'a'));

        // Return the modified string
        return sb.toString();

    }

}
