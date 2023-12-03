package com.spring.springframework;

import com.spring.springframework.game.GameRunner;
import com.spring.springframework.game.MarioGame;
import com.spring.springframework.game.PacmanGame;
import com.spring.springframework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
