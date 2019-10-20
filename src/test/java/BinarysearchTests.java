import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarysearchTests {

    @Test
    void emptyList() {
        int[] testArr = new int[0];
        assertEquals(-1, Binarysearch.binaryserach(testArr, 1));
    }

    @Test
    void singleItemInList() {
        int[] testArr = new int[]{0};
        assertEquals(0, Binarysearch.binaryserach(testArr, 0));
    }

    @Test
    void singleItemNotInList() {
        int[] testArr = new int[]{0};
        assertEquals(-1, Binarysearch.binaryserach(testArr, 1));
    }

    @Test
    void firstItem() {
        int[] testArr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(0, Binarysearch.binaryserach(testArr, 0));
    }

    @Test
    void lastItem() {
        int[] testArr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(8, Binarysearch.binaryserach(testArr, 8));
    }

    @Test
    void middleItem() {
        int[] testArr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(4, Binarysearch.binaryserach(testArr, 4));
    }

    @Test
    void random() {
        Random r = new Random();
        int[] testArr = new int[20];
        for (int i = 0; i < testArr.length; i++) {
            testArr[i] = r.nextInt();
        }

        assertEquals(testArr[14], testArr[Binarysearch.binaryserach(testArr, testArr[14])]);
    }
}
