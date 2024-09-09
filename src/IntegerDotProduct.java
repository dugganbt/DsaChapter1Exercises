public class IntegerDotProduct {

    public static int[] integerDotProduct(int[] a, int[] b){

        if (a.length == b.length) {
            int[] c = new int[a.length];

            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] * b[i];
            }
            return c;
        }
        return null;
    }

}
