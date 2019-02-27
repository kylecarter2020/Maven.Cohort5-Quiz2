package com.zipcodewilmington.assessment2.part2;

import java.util.SortedMap;
import java.util.TreeMap;

public class Router {
    SortedMap<String, String> map;

    public Router(){
        map = new TreeMap<>();
    }
    public void add(String path, String controller) {
        map.put(path, controller);
    }

    public Integer size() {
        return map.size();
    }

    public String getController(String path) {
        return map.get(path);
    }

    public void update(String path, String studentController) {
        map.remove(path);
        map.put(path, studentController);
    }

    public void remove(String path) {
        map.remove(path);
    }

    public String toString(){
        String result = "";

        for(String key : map.keySet()){
            result += key + " -> " + map.get(key) + "\n";
        }
        return result;
    }
}
