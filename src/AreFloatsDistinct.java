/**
 * Write a Java method that takes an array of float values and determines
 * if all the numbers are different from each other (that is, they are distinct).
 */
public class AreFloatsDistinct {

    /**
     * Checks if array of floats has only distinct values
     * @param floatArray array to check
     * @return true, if all values distinct; false otherwise
     */
    public static boolean areFloatsDistinct(float[] floatArray){

        for (int i =0; i<floatArray.length;i++){            //iterate over each element in array
            for (int j = i + 1; j<floatArray.length;j++){   //iterate over elements with higher index
                if (floatArray[i] == floatArray[j]){return false;} //check if equal
            }
        }
        return true;   //false if no elements are equal, i.e. all floats are distinct
    }



}
