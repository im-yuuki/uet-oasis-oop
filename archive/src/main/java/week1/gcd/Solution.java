package week1.gcd;

public class Solution {

    /**
     * Greatest common divisor.
     * @param a an integer
     * @param b an integer
     * @return value
     */
    public int gcd(int a, int b) {
        if (b == 0) {
            if (a > 0) {
                return a;
            } else {
                return -a;
            }
        }
        return gcd(b, a % b);
    }

}