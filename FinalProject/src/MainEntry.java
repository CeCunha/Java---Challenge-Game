/**
 * Application Purpose: A class for the main method, responsible for the entry point for the game.
 *                      Stars the entire game.
 * Author: Yan Uchitel
 * Date: 2022/12/06
 */
public class MainEntry {
    public static void main(String[] args) {
        GameLoop game = new GameLoop();

        game.startGame();
        System.exit(0);
    }
}