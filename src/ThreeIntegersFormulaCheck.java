import java.util.Scanner;


/**
 * Write a short program that takes as input three integers ,a,b,
 * and c, from the Java console and determines if they can be used
 * in a correct arithmetic formula (in the given order), like “a + b = c,” “a = b − c,” or “a ∗ b = c.”
 */
public class ThreeIntegersFormulaCheck {

    /**
     * Checks if integers a, b, and c entered in the console
     * can be used in 3 formulas correctly “a + b = c,” “a = b − c,” or “a ∗ b = c"
     */
    public static void threeIntegersFormulaCheck(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type 3 integers to see if they fulfill these formulas: 1) “a + b = c” 2) “a = b − c” or 3) “a ∗ b = c");

        System.out.print("Input integer a: ");
        int a = scanner.nextInt();

        System.out.print("Input integer b: ");
        int b = scanner.nextInt();

        System.out.print("Input integer c: ");
        int c = scanner.nextInt();

        // initialize calculations prior to if statements
        int abSum = a+b;
        int bcSubstraction = b-c;
        int abProduct = a*b;

        boolean fulfilled = false;

        // checking the formulas
        if (abSum == c){
            System.out.println("a: " + a + " ; b: " + b + " ; c: "+ c + " fulfill the formula: a + b = c");
            fulfilled = true;
        }

        if (a == bcSubstraction) {
            System.out.println("a: " + a + " ; b: " + b + " ; c: "+ c + " fulfill the formula: a = b − c");
            fulfilled = true;
        }

        if (abProduct == c) {
            System.out.println("a: " + a + " ; b: " + b + " ; c: " + c + " fulfill the formula: a ∗ b = c");
            fulfilled = true;
        }

        if (!fulfilled) {
            System.out.println("a: " + a + " ; b: " + b + " ; c: "+ c + " do not fulfill any of the three formulas");
        }
    }

}
