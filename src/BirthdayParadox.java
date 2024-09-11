import java.util.Arrays;
import java.util.Random;

/**
 * Question addressed:
 * The birthday paradox says that the probability that two people in a room will have the same birthday
 * is more than half, provided n, the number of people in the room, is more than 23.
 * This property is not really a paradox, but many people find it surprising.
 * Design a Java program that can test this paradox by a series of experiments on randomly generated birthdays,
 * which test this paradox for n = 5,10,15,20,...,100.
 */
public class BirthdayParadox {

    /**
     * Tests the birthday paradox for n birthdays
     * @param n, number of random birthdays to include in the test
     */
    public static void testBirthdayParadox(int n){

        // generate n random birthdays
        String[] randomBirthdays = generateRandomBirthday(n);

        // assess how many duplicates there are
        findMultiples(randomBirthdays);

    }

    /**
     * Generates a string array with n entries, of random birthdays (not accounting for leap years
     * @param n, number of birthdays
     * @return string array with n entries of random birthdays
     */
    private static String[] generateRandomBirthday(int n){

        String[] birthdays = new String[n];
        Random random = new Random();

        for (int i = 0; i<n; i++){

            // Generate a random month between 1 and 12
            int month = random.nextInt(12) + 1;

            // Determine the number of days in the randomly selected month
            int day = 0;
            switch (month) {
                case 2:  // February
                    day = random.nextInt(28) + 1; // February has 28 days (ignoring leap year)
                    break;
                case 4: case 6: case 9: case 11:  // April, June, September, November
                    day = random.nextInt(30) + 1; // These months have 30 days
                    break;
                default:  // January, March, May, July, August, October, December
                    day = random.nextInt(31) + 1; // These months have 31 days
                    break;
            }
            birthdays[i] = "DD/MM: "+ day +"/"+ month;
            //System.out.println(birthdays[i]);
        }

        return birthdays;
    }

    /**
     * Prints out entries with at least two occurrences in the string array
     * @param stringArray, array of strings to check for multiples
     */
    private static void findMultiples(String[] stringArray){
        // Sort the array -> get all equal birthdays next to each other
        Arrays.sort(stringArray);

        // Count occurrences of each string
        System.out.println("Entries with at least 2 occurrences:");
        int count = 1;
        for (int i = 1; i < stringArray.length; i++) {
            if (stringArray[i].equals(stringArray[i - 1])) { // current entry equals previous
                count++;
            } else { // no further birthdays that are the same
                if (count >= 2) {
                    System.out.println(stringArray[i - 1] + ": " + count + " times");
                }
                count = 1; // reset the counter for the next string
            }
        }
        // Check the last element
        if (count >= 2) {
            System.out.println(stringArray[stringArray.length - 1] + ": " + count + " times");
        }
    }

}
