package org.example.slow;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    private final BubbleSort bubbleSort = new BubbleSort();

    @Test
    void should_sortArray() {
        //when
        List<Integer> list = bubbleSort.sort(Arrays.asList(2,3,5,7,2,5,78,4,3,2,3,4,67,6,4323,3,4,5, Integer.MIN_VALUE, Integer.MAX_VALUE));

        //then
        List<Integer> expectedList = Arrays.asList(-2147483648, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 7, 67, 78, 4323, 2147483647);
        assertThat(list).isEqualTo(expectedList);
    }
}