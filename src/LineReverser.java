import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a short Java program that takes all the lines input to standard input
 * and writes them to standard output in reverse order.
 * That is, each line is output in the correct order, but the ordering of the lines is reversed.
 */
public class LineReverser {

    public static void lineReverse(){

        System.out.println("Enter multiple lines to reverse. Entering an empty line will signal end of input.");

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        // Read all lines of input
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if (line.isEmpty()) { // Optional: stop if an empty line is entered
                break;
            }
            lines.add(line);
        }

        // Print lines in reverse order
        for (int i = lines.size() - 1; i >= 0; i--) {
            System.out.println(lines.get(i));
        }

        scanner.close(); // Always close the scanner when you're done
    }

}
