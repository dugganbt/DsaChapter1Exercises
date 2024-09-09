/**
 * Question: Write a Java program that can take a positive integer greater than 2
 * as input and write out the number of times one must repeatedly divide
 * this number by 2 before getting a value less than 2.
 */
public class DivideBy2LessThan2 {

    private static int divisions = 0;


    public static void divideBy2LessThan2(int n){

        if (n>2){
            divisions++;
            int ratio = n/2;
            System.out.println(ratio);
            divideBy2LessThan2(ratio);
        } else{
            System.out.println("n was not > 2.");
            System.out.println("Divisions: " + divisions);
        }
    }

}
