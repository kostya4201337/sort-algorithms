package org.example.slow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    private final BubbleSort bubbleSort = new BubbleSort();

    @Test
    void should_sortArray() {
        //when
        int[] arr = bubbleSort.sort(new int[]{2,3,5,7,2,5,78,4,3,2,3,4,67,6,4323,3,4,5, Integer.MIN_VALUE, Integer.MAX_VALUE});

        //then
        int[] expectedArray = {-2147483648, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 7, 67, 78, 4323, 2147483647};
        assertThat(arr).isEqualTo(expectedArray);
    }
}