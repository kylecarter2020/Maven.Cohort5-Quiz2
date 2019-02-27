package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    private Integer input;
    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    Boolean isWu() {
        return (this.input % 3) == 0;
    }

    Boolean isTang() {
        return (this.input % 5) == 0;
    }

    Boolean isWuTang() {
        return (this.input % 15) == 0;
    }
}
