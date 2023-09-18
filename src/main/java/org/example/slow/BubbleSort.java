package org.example.slow;

import org.example.Sorter;

import java.util.List;

public class BubbleSort implements Sorter {

    @Override
    public List<Integer> sort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size() - i; j++) {
                if (list.get(j) < list.get(j - 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, temp);
                }
            }
        }
        return list;
    }
}
