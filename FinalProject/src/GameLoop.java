/**
 * Application Purpose: A class responsible for creating a the main game object
 *                      and responsible for the progress in the game
 * Author: Yan Uchitel
 * Date: 2022/12/06
 */
import java.util.Scanner;

public class GameLoop {

    private GraphicGame graphics;
    private Challenges challenges;
    private Player player;
    private Scanner in;

    // constructs the game loop object
    public GameLoop() {
        graphics = new GraphicGame();
        challenges = new Challenges();
        player = new Player(5, 1, 0);
        in = new Scanner(System.in);
    }

    public void startGame() {
        // introduction of the game
        // todo: add playing instructions
        System.out.println(graphics.getMenu());
        System.out.println(graphics.getTextRules());
        pressEnter(in);
        System.out.println(graphics.getKnight1());
        pressEnter(in);

        // starts the challenges
        if (challange1() && challange2() && challange3()) {
            System.out.println(graphics.getEndGame1());
            pressEnter(in);
            System.out.println(graphics.getEndGame2());
            pressEnter(in);
            System.out.println(graphics.getEndGame3());
            pressEnter(in);
            System.out.println(graphics.getEndGame4());
            pressEnter(in);
            System.out.println(graphics.getEndGame5());
            pressEnter(in);
        }
        else {
            // Game Over
            System.out.println(graphics.getGameOver());
            System.exit(0);
        }

        in.close();
    }

    // start of challange 1
    private boolean challange1() {
        player.setNumRiddleTips(1);
        System.out.println(graphics.getChl1());
        System.out.println(challenges.getChallange(0));

        String ch1Answer = challenges.getCorrectAnswer(0);
        String guess = in.nextLine().toLowerCase();

        if (solveAttempts(ch1Answer, guess, 0)) {
            System.out.println(graphics.getYouGotIt());
            pressEnter(in);
            return true;
        }
        return false;
    }

    // start of challange 2
    private boolean challange2() {
        player.setNumRiddleTips(1);
        System.out.println(graphics.getChl2());
        System.out.println(challenges.getChallange(1));

        String ch2Answer = challenges.getCorrectAnswer(1);
        String guess = in.nextLine().toLowerCase();

        if (solveAttempts(ch2Answer, guess, 1)) {
            System.out.println(graphics.getYouGotIt2());
            pressEnter(in);
            return true;
        }
        return false;
    }

    // start of challange 3
    private boolean challange3() {
        player.setNumRiddleTips(1);
        System.out.println(graphics.getChl3());
        System.out.println(challenges.getChallange(2));

        String ch3Answer = challenges.getCorrectAnswer(2);
        String guess = in.nextLine().toLowerCase();

        if (solveAttempts(ch3Answer, guess, 2)) {
            System.out.println(graphics.getYouGotIt3());
            pressEnter(in);
            return true;
        }
        return false;
    }

    private boolean solveAttempts(String chlAnswer, String guess, int chlNum) {
        // loops while the player is alive and asking for an answer. once the lives run
        // out its game over.
        while (player.getlife() > 0) {
            if (guess.equals(chlAnswer)) {
                return true;
            }
            else if (guess.equals("potion") && player.getNumRiddleTips() == 1) {
                int riddleNum = player.getNumRiddleTips();
                player.setNumRiddleTips(riddleNum -= 1);
                System.out.println(challenges.getChallangeTip(chlNum));
                System.out.println("Number of potions left: " + player.getNumRiddleTips());
            }
            else if (guess.equals("potion") && player.getNumRiddleTips() == 0) {
                System.out.println("You dont have any potions left for this challange.");
            }
            else {
                int life = player.getlife();
                player.setlife(life -= 1);
                System.out.println(
                        "WRONG ANSWER | WRONG ANSWER  || ........ TRY AGAIN ........ ||  WRONG ANSWER | WRONG ANSWER");
                System.out.println("LIFE LEFT: " + player.getlife());
            }
            guess = in.nextLine().toLowerCase();
        }

        return false;
    }

    private void pressEnter(Scanner in) {
        try {
            in.nextLine();
        }
        catch (Exception e) {
            System.out.println("Problem accepting input to user");
        }
    }
}