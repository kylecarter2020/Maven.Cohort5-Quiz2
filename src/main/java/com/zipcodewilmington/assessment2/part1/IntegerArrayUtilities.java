package com.zipcodewilmington.assessment2.part1;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return (array.length % 2) == 0;
    }

    public Integer[] range(int start, int stop) {
        ArrayList<Integer> getRange = new ArrayList<>();

        for (int i = start; i <= stop; i++) {
            getRange.add(i);
        }

        if(getRange.size() > 0) {
            Integer[] result = getRange.toArray(new Integer[getRange.size()]);
            return result;
        }
        else {
            Integer[] result = {0};
            return result;
        }
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer sum = 0;
        for (int i = 0; i < 2; i++) {
            sum += array[i];
        }
        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        Integer product = 1;
        for (int i = 0; i < 2; i++) {
            product *= array[i];
        }
        return product;
    }
}
