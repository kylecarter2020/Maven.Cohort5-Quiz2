package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        ArrayList<Integer> merge = new ArrayList<>();
        merge.addAll(Arrays.asList(array1));
        merge.addAll(Arrays.asList(array2));
        return merge.toArray(new Integer[0]);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        ArrayList<Integer> rotate = new ArrayList<>();
        rotate.addAll(Arrays.asList(array).subList(index, array.length));
        rotate.addAll(Arrays.asList(array).subList(0, index));
        return rotate.toArray(new Integer[0]);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer count = 0;
        ArrayList<Integer> merged = new ArrayList<>(Arrays.asList(merge(array1, array2)));
        for (Integer i : merged) {
            if (i.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        Integer mostCommon = array[0];
        Integer maxCount = 0;

        for (int i = 0; i < array.length; i++) {
            Integer count = countOccurrence(array, i);

            if (count > maxCount) {
                mostCommon = i;
                maxCount = count;
            }
        }
        return mostCommon;
    }

    private Integer countOccurrence(Integer[] array1, Integer valueToEvaluate) {
        Integer count = 0;
        for (Integer i : array1) {
            if (i.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }
}
