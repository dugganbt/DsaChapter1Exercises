/**
 * Write a short Java method that takes
 * an array of int values and determines if there is a
 * pair of distinct elements of the array whose product is even.
 */
public class EvenPairInIntegerArray {

    public static void evenPairInIntegerArray (int[] integerArray){

        // iterate over each element in array
        for (int i = 0; i<integerArray.length; i++){

            // start from the next element to avoid including duplications
            for (int j=i + 1; j<integerArray.length; j++){

                // check if a pair of distinct values is even
                if ((integerArray[i]*integerArray[j])%2 == 0){
                    System.out.print("Product of " + integerArray[i] + " and " + integerArray[j] + " is even");
                    System.out.println(". The Product equals: " + (integerArray[i]*integerArray[j]));
                }
            }
        }
    }
}
