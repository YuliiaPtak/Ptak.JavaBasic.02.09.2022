import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import unitTesting.MathUtils;


public class MathUtilsTest {

    @Test
    public void shouldCalculateArithmeticalMean() {
        int[] numbers = new int[]{2, 6, 3, 1};
        Assertions.assertEquals(3, MathUtils.arithmeticalMean(numbers));
    }

    @Test
    public void shouldBeSquare() {
        int[][] ints = new int[3][3];
        Assertions.assertTrue(MathUtils.isSquareArray(ints));
    }
}
