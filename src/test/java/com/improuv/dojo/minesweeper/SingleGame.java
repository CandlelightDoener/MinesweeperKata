package com.improuv.dojo.minesweeper;

import java.util.Arrays;

public class SingleGame {
    private static final char[] END_OF_INPUT = "0 0".toCharArray();

    char[] input;

    public SingleGame(char[] input) {
        this.input = input;
    }


    boolean isEmpty() {
        return Arrays.equals(input, END_OF_INPUT);
    }

    boolean hasMine() {
        for (char c : input) {
            if(c == '*')
                return true;
        }

        return false;
    }

    String resolve() {
        if (hasMine()) {
            return "*";
        } else {
            return "0";
        }
    }
}