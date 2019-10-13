import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortTests {

    @Test
    void emptyList() {
        int[] testArr = new int[0];
        SelectionSort.sort(testArr);
        assertArrayEquals(new int[]{}, testArr);
    }

    @Test
    void singleItem() {
        int[] testArr = new int[]{0};
        SelectionSort.sort(testArr);
        assertArrayEquals(new int[]{0}, testArr);
    }

    @Test
    void preordered(){
        int[] testArr = new int[]{-1,0,1,2,3};
        SelectionSort.sort(testArr);
        assertArrayEquals(new int[]{-1,0,1,2,3}, testArr);
    }

    @Test
    void unsorted(){
        int[] testArr = new int[]{ 8, 12, 5, 2, 25, -2, 0 };
        SelectionSort.sort(testArr);
        assertArrayEquals(new int[]{-2, 0, 2, 5, 8, 12, 25}, testArr);
    }

    @Test
    void random(){
        Random r = new Random();
        int[] testArr = new int[20];
        for (int i = 0; i < testArr.length; i++) {
            testArr[i] = r.nextInt();
        }
        int[] testArrClone = testArr.clone();

        SelectionSort.sort(testArr);
        Arrays.sort(testArrClone);

        assertArrayEquals(testArrClone, testArr);
    }
}
