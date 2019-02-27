package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    private ArrayList<Integer> list;

    public ListUtility() {
        list = new ArrayList<>();
    }

    public Boolean add(Integer i) {
        Boolean add = false;
        list.add(i);
        if (list.contains(i)) {
            add = true;
        }
        return add;
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> unique = new ArrayList<>();
        for (Integer i : list) {
            if (!unique.contains(i)) {
                unique.add(i);
            }
        }
        return unique;
    }

    public String join() {
        String result = "";

        for (Integer i : list) {
            result += i + ", ";
        }
        result.trim();

        return result.substring(0, result.length() - 2);
    }

    public Integer mostCommon() {
        ArrayUtility arrayUtility = new ArrayUtility();
        return arrayUtility.mostCommon(list.toArray(new Integer[0]));
    }

    public Boolean contains(Integer valueToAdd) {
        Boolean contains = false;

        if (list.contains(valueToAdd)) {
            contains = true;
        }
        return contains;
    }
}
