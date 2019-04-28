/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

interface Game {
    boolean move();
}

interface GameFactory {
    Game getGame();
}


class Checker implements Game {
    private int moves = 0;
    private static final int MOVES = 3; 
    
    public boolean move() {
        System.out.println("Checker() move " + moves);
        return ++moves != MOVES;
    }
    
}

class CheckerFactory implements GameFactory {
    public Game getGame() {
        return new Checker();
    }
}


class Chess implements Game {
    private int moves = 0;
    private static final int MOVES = 4; 
    
    public boolean move() {
        System.out.println("Chess() move " + moves);
        return ++moves != MOVES;
    }
}

class ChessFactory implements GameFactory {
    public Game getGame() {
        return new Chess();
    }
}
/**
 *
 * @author harrison
 */
public class Games {
    
    public static void playGame(GameFactory gamefactory) {
        Game s = gamefactory.getGame();
        while(s.move()) {
            ;
        }
    }
    
    public static void main(String[] args) {
        playGame(new CheckerFactory());
        playGame(new ChessFactory());
    }
    
}
