package com.spring.springframework.game;

public class PacmanGame implements GamingConsole {
    public void up() {
        System.out.println("pacman up");
    }
    public void down() {
        System.out.println("Pacman Go into a hole");
    }

    public void left() {
        System.out.println("Pacman Go back");
    }

    public void right() {
        System.out.println("Pacman Accelerate");
    }
}
