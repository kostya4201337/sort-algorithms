package org.example.slow;

import org.example.Sorter;

import java.util.List;

public class SelectionSort implements Sorter {

    @Override
    public List<Integer> sort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int j = i; j < list.size(); j++) {
                if (list.get(j) <= min) {
                    min = list.get(j);
                    index = j;
                }
            }
            int temp = list.get(i);
            list.set(i, list.get(index));
            list.set(index, temp);
        }
        return list;
    }
}
