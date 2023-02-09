/**
 * Application Purpose: A class responsible for creating a player object,
 *                      and to return and set his attributes. Like the player's health and amount of tips left
 * Author: Eliezer
 * Date: 2022/11/05
 */
public class Player {

    private int life;
    private int numRiddleTips;

    public Player(int life, int numRiddleTips, int points) {
        this.life = life;
        this.numRiddleTips = numRiddleTips;
    }

    // Getters & Setters
    public int getlife() {
        return life;
    }

    public void setlife(int score) {
        this.life = score;
    }

    public int getNumRiddleTips() {
        return numRiddleTips;
    }

    public void setNumRiddleTips(int numRiddleTips) {
        this.numRiddleTips = numRiddleTips;
    }
}