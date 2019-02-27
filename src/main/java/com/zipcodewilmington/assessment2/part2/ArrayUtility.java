package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        ArrayList<Integer> merge = new ArrayList<>();
        merge.addAll(Arrays.asList(array1));
        merge.addAll(Arrays.asList(array2));
        return merge.toArray(new Integer[merge.size()]);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        ArrayList<Integer> rotate = new ArrayList<>();

        for (int i = index - 1; i < array.length; i++) {
            rotate.add(array[i]);
        }
        for (int i = 0; i < index; i++) {
            rotate.add(array[i]);
        }
        return rotate.toArray(new Integer[rotate.size()]);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer count = 0;
        ArrayList<Integer> merged = new ArrayList<>();
        merged.addAll(Arrays.asList(merge(array1, array2)));
        for (Integer i : merged) {
            if(i == valueToEvaluate){
                count++;
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        Integer mostCommon = 0;
        Integer count = 0;
        Integer maxCount = 0;

        for (int i = 0; i < array.length; i++) {

        }
        return mostCommon;
    }
}
