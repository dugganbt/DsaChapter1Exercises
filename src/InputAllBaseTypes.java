import java.util.Scanner;

public class InputAllBaseTypes {

    /**
     * asks for user input of each base type, and then prints them
     *
     * Exceptions are not handled if incorrect base type is entered.
     */
    public static void inputAllBaseTypes() {

        Scanner scanner = new Scanner(System.in);

        // Prompt and input for each base type
        System.out.print("Enter a byte value: ");
        byte byteValue = scanner.nextByte();

        System.out.print("Enter a short value: ");
        short shortValue = scanner.nextShort();

        System.out.print("Enter an int value: ");
        int intValue = scanner.nextInt();

        System.out.print("Enter a long value: ");
        long longValue = scanner.nextLong();

        System.out.print("Enter a float value: ");
        float floatValue = scanner.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();

        System.out.print("Enter a char value: ");
        char charValue = scanner.next().charAt(0);

        System.out.print("Enter a boolean value: ");
        boolean booleanValue = scanner.nextBoolean();

        // Print the values back
        System.out.println("byte value: " + byteValue);
        System.out.println("short value: " + shortValue);
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("char value: " + charValue);
        System.out.println("boolean value: " + booleanValue);

    }

}
