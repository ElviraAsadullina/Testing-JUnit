package Homework6Test;

import org.junit.jupiter.api.Test;

import static main.java.Homework6.Average.averageArrays;
import static org.assertj.core.api.Assertions.assertThat;

public class TestAverage {
    @Test
    public void testFirstBigger() {
        int[] firstNumArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] secondNumArray = new int[]{1, 2, 3, 4, 5, 6, 5};

        assertThat(averageArrays(firstNumArray, secondNumArray))
                .isEqualTo("Avg is higher for first list");
    }

    @Test
    public void testSecondBigger() {
        int[] firstNumArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] secondNumArray = new int[]{1, 2, 3, 4, 5, 6, 9};

        assertThat(averageArrays(firstNumArray, secondNumArray))
                .isEqualTo("Avg is higher for second list");
    }

    @Test
    public void testEquals() {
        int[] firstNumArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] secondNumArray = new int[]{1, 2, 3, 4, 5, 6, 7};

        assertThat(averageArrays(firstNumArray, secondNumArray))
                .isEqualTo("Avgs for both lists are equal");
    }
}
