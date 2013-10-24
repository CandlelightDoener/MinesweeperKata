package com.improuv.dojo.minesweeper;

import java.util.LinkedList;
import java.util.List;

public class GameInput {
    final List<SingleGame> games;

    public GameInput(String input) {
        games = new LinkedList<SingleGame>();
        games.add(new SingleGame(input.toCharArray()));
    }

    private SingleGame getSingleGame() {
        return games.get(0);
    }

    String play() {
        if (getSingleGame().isEmpty())
            return "";
        return "Field #1\n" +
                getSingleGame().resolve();
    }
}
