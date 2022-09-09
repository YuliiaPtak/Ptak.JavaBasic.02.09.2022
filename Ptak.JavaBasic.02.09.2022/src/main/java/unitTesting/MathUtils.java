package unitTesting;

public class MathUtils {

    public static int arithmeticalMean(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum / numbers.length;
    }

    public static boolean isSquareArray(int[][] o) {
        for (int[] objects : o) {
            if (o.length != objects.length) return false;
        }
        return true;
    }
}
