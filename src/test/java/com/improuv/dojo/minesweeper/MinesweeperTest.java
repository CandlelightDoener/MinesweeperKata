package com.improuv.dojo.minesweeper;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class MinesweeperTest {
    public static final String SPEC_END_OF_INPUT = "0 0";

    MinesweeperGame game = new MinesweeperGame();

    @Test
    public void noInputFields_returnsEmptyString() throws Exception {
        String input = SPEC_END_OF_INPUT;
        GameInput gameInput = new GameInput(input);
        String result = gameInput.play();
        assertThat(result, is(""));
    }

    @Test
    public void oneCellFieldWithNoMine() throws Exception {
        String input = "1 1" +
                "." +
                SPEC_END_OF_INPUT;
        GameInput gameInput = new GameInput(input);
        String result = gameInput.play();
        assertThat(result, is("Field #1\n" +
                "0"));
    }

    @Test
    public void oneCellFieldWithMine() throws Exception {
        String input = "1 1" +
                "*" +
                SPEC_END_OF_INPUT;
        GameInput gameInput = new GameInput(input);
        String result = gameInput.play();
        assertThat(result, is("Field #1\n" +
                "*"));
    }

    @Ignore
    @Test
    public void twoCellFieldWithoutMines() throws Exception {
        String input = "1 2" +
                ".." +
                SPEC_END_OF_INPUT;
        GameInput gameInput = new GameInput(input);
        String result = gameInput.play();
        assertThat(result, is("Field #1\n" +
                "00"));
    }



}
