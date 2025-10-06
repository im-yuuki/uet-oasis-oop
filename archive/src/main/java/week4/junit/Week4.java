package week4.junit;

public class Week4 {

    /** javadoc */
    public static int max2Int(int a, int b) {
        return Math.max(a, b);
    }

    /** javadoc */
    public static int minArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /** javadoc */
    public static String calculateBMI(double weight, double height) {
        double bmi = Math.round((weight / (height * height)) * 10) / 10.0;
        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi < 23) {
            return "Bình thường";
        } else if (bmi < 25) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }

}
