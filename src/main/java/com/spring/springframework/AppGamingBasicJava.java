package com.spring.springframework;

import com.spring.springframework.game.GameRunner;
import com.spring.springframework.game.MarioGame;
import com.spring.springframework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
//        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();


        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}
