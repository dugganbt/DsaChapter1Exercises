import java.util.Scanner;
import java.util.ArrayList;

/**
 * Question addressed: Write a Java program that can simulate a simple calculator,
 * using the Java console as the exclusive input and output device.
 * That is, each input to the calculator, be it a number, like 12.34 or 1034, or an operator,
 * like + or =, can be done on a separate line.
 * After each such input, you should output to the Java console what would be displayed on your calculator.
 *
 * A class that allows for simple calculations with two operands and an operator, entered line-by-line.
 */
public class Calculator {

    /**
     * Constructor for a calculator object. Currently merely to access the calculate method.
     */
    public Calculator(){}

    /**
     * initiates the calculate method, which includes:
     * 1) entering line-by-line the operands, and the operator in between (calls inputCalculation)
     * 2) parsing input, which then calls the perform calculation function (actually calculating the result)
     * 3) asks if more calculation should be performed
     */
    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        String continueCalculation;

        do {
            ArrayList<String> input = inputCalculation();
            parseInput(input);

            System.out.println("Do you want to perform another calculation? (yes/no)");
            continueCalculation = scanner.nextLine().toLowerCase();
        } while (continueCalculation.equals("yes"));

        System.out.println("Calculator shutting down.");
    }

    /**
     * Switches on calculator, i.e. user can input calculations until empty line is entered.
     * @return ArrayList of calculations entered
     */
    private ArrayList<String> inputCalculation(){

        System.out.println("Enter a formula, with each part of the formula on a new line. For example \nx\n+\ny");
        System.out.println("Enter an empty line to execute the calculation");
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
        return lines;
    }

    /**
     * Parse the input
     */
    private void parseInput(ArrayList<String> inputFormula){
        // Initialize variables with default values
        double a = 0;  // or some default value
        double b = 0;  // or some default value
        char operator = '+';  // or any valid default operator

        // Ensure that the input list has exactly 3 elements
        if (inputFormula.size() != 3) {
            System.out.println("Error: Expected format is [number operator number].");
            return;
        }

        try {
            a = Double.parseDouble(inputFormula.get(0));
            operator = inputFormula.get(1).charAt(0);
            if (!isValidOperator(operator)) {
                System.out.println("Error: Invalid operator.");
                return;
            }
            b = Double.parseDouble(inputFormula.get(2));
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter valid numbers.");
            return;
        }

        performCalculation(a,b,operator);
    }

    /**
     * Assesses whether the input operator is supported by the calculator
     * @param operator char entered by user
     * @return true, if operator is supported; else, otherwise.
     */
    private boolean isValidOperator(char operator) {
        return operator == '+' || operator == '-' || operator == '*' ||
                operator == '/' || operator == '^' || operator == '%';
    }

    /**
     * Calculate and print out the input
     * @param a number a
     * @param b number b
     * @param operator char of an operation to peform.
     */
    private void performCalculation(double a, double b, char operator) {
        double result;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                result = a / b;
                break;
            case '^':
                result = Math.pow(a, b);
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println("Invalid operator entered.");
                return;
        }
        System.out.println("Result = " + result);
    }

}
