/**
 * Application Purpose: A class responsible creating a challenges object and returns all the challenges for each level,
 *                      their hints, and correct answers.
 * Author: Shuhua You
 * Date: 2022/12/05
 */
public class Challenges {

    // challege questions array
    private String[] challangesArray = {"""
        Now .... you must figure how unlock the door to continue !!!

        To open this loockpick, you have to replace the ? with the correct number.
        You can find the secret by determining the || PATTERN || behind the numbers shown

        

                                                          ##############################################
                                                          ###                                        ###
                                                          ###  Or you can use your Potions for Tips  ###
Input 2 corrects number to open (e.g.: 56):               ###    to help you. Just type: potion      ###
                                                          ###                                        ###
                                                          ##############################################       
            """,
            """
                                                ##############################################
                                                ###                                        ###
                                                ###  Or you can use your Potions for Tips  ###
Which entrance is correct ? a, b, c or d ?      ###    to help you. Just type: potion      ###
                                                ###                                        ###
                                                ##############################################      """, 
            """
                                 ##############################################
                                 ###                                        ###
                                 ###  Or you can use your Potions for Tips  ###
What is the right answer ?       ###    to help you. Just type: potion      ###
                                 ###                                        ###
                                 ##############################################    """};

    // challege answers array
    private String[] answersArray = {"12", "c", "dark"};

    // tips array for the challenges
    private String[] tips = {"> > > > > > > Every number in the bottom row is the number above it minus 3. < < < < < < <",
                            "> > > > > > > There are no exits in options A and B < < < < < < <",
                            "> > > > > > > The answer might be one these options: air, dark, water, light < < < < < < <"};

    // The Constructor
    public Challenges() {
    }

    // getter of the arruguments
    public String getChallange(int challangeNum) {
        return this.challangesArray[challangeNum];
    }

    public String getCorrectAnswer(int challangeNum){
        return this.answersArray[challangeNum];
    }

    public String getChallangeTip(int challangeNum){
        return this.tips[challangeNum];
    }
}