package week1.fraction;

// I DO NOT PROVIDE JAVADOCS FOR THIS CLASS
// PLEASE ADD IT YOURSELF
public class Solution {

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private int numerator = 0;
    private int denominator = 1;

    public Solution(int numerator) {
        this.numerator = numerator;
    }

    public Solution(int numerator, int denominator) {
        if (denominator == 0) {
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            return;
        }
        this.denominator = denominator;
    }

    public Solution reduce() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        return new Solution(numerator / gcd, denominator / gcd);
    }

    public Solution add(Solution f) {
        Solution result = new Solution(
                this.numerator * f.denominator + f.numerator * this.denominator,
                this.denominator * f.denominator
        ).reduce();
        this.numerator = result.numerator;
        this.denominator = result.denominator;
        return this;
    }

    public Solution subtract(Solution f) {
        Solution result = new Solution(
                this.numerator * f.denominator - f.numerator * this.denominator,
                this.denominator * f.denominator
        ).reduce();
        this.numerator = result.numerator;
        this.denominator = result.denominator;
        return this;
    }

    public Solution multiply(Solution f) {
        Solution result = new Solution(
                this.numerator * f.numerator,
                this.denominator * f.denominator
        ).reduce();
        this.numerator = result.numerator;
        this.denominator = result.denominator;
        return this;
    }

    public Solution divide(Solution f) {
        if (f.numerator == 0) {
            return this;
        }
        Solution result = new Solution(
                this.numerator * f.denominator,
                this.denominator * f.numerator
        ).reduce();
        this.numerator = result.numerator;
        this.denominator = result.denominator;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Solution) {
            Solution self = this.reduce();
            Solution other = ((Solution) obj).reduce();
            return self.numerator == other.numerator && self.denominator == other.denominator;
        }
        return false;
    }

}
