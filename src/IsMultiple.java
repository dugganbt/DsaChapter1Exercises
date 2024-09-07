/**
 * Utility class that provides a method to check if one number is a multiple of another.
 *
 * Question addressed: Write a short Java method, isMultiple, that takes two long values, n and m,
 * and returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
 */
public class IsMultiple {

    /**
     * Checks if the value of {@code n} is a multiple of {@code m}.
     * @param n value which may be a multiple of m
     * @param m value, which n may be a multiple of
     * @return true if n is a multiple of m, false if not
     */
    public static boolean isMultiple(long n, long m) {

        // logical test: if n mod m equals zero, then n is a multiple of m
        return n % m == 0;
    }
}
