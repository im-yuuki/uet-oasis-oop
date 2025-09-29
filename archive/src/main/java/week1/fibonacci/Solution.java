package week1.fibonacci;

public class Solution {

    /**
     * Function definition.
     * @param n parameter n
     * @return value
     */
    public long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }
        if (n < 2) {
            return n;
        }
        long tmp1 = 0;
        long tmp2 = 1;
        for (long i = 2; i <= n; i++) {
            long temp = tmp1 + tmp2;
            tmp1 = tmp2;
            tmp2 = temp;
        }
        if (tmp2 > 0) {
            return tmp2;
        } else {
            return Long.MAX_VALUE;
        }
    }

}
