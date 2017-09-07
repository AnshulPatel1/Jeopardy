/** Object Game that uses the Questions and Answers object to store questions, answers, and their score value
 * ICS4U1
 * @author - Anshul Patel
 * @since 06/06/2015
 */

//Importing the required libraries needed for this class to run
package jeopardy;
import java.util.*;

public class Game {
    
    //The instance variables needed for the game object
    QuestionsAndAnswers [][] questionsAndAnswers = new QuestionsAndAnswers[5][6]; //2D array to store each question, its answer, and score value
    private int turn = 1;
    private int scoreP1 = 0;
    private int scoreP2 = 0;
    private int scoreP3 = 0;

    /** Creates a new game object with the 2D array filled up with questions, their answers, and each of their score values
    */
    public Game () {
        questionsAndAnswers[0][3] = new QuestionsAndAnswers("He became famous through youtube and is the artist who sang 'Baby'","Justin Beiber", 200);
        questionsAndAnswers[1][3] = new QuestionsAndAnswers("This movie is at the top of the current box office records ","Avatar",400);
        questionsAndAnswers[2][3] = new QuestionsAndAnswers("Played 'The Joker' in The Dark Knight","Heath Ledger",600);
        questionsAndAnswers[3][3] = new QuestionsAndAnswers("The fox theif ","Oceans Twelve",800);
        questionsAndAnswers[4][3] = new QuestionsAndAnswers("Up is Down ","Pirates of the Caribbean",1000);
        questionsAndAnswers[0][2] = new QuestionsAndAnswers("Winner of most tennis grandslams ","Roger Federer",200);
        questionsAndAnswers[1][2] = new QuestionsAndAnswers("The number of goals scored in a hatrick (Spell it)","Three",400);
        questionsAndAnswers[2][2] = new QuestionsAndAnswers("The sport Tiger Woods plays ","Golf",600);
        questionsAndAnswers[3][2] = new QuestionsAndAnswers("Waka Waka ","Soccer",800);
        questionsAndAnswers[4][2] = new QuestionsAndAnswers("Team in the NBA named with a number","Philadelphia 76'ers",1000);
        questionsAndAnswers[0][1] = new QuestionsAndAnswers("The study of life ","Biology",200);
        questionsAndAnswers[1][1] = new QuestionsAndAnswers("The man with the highest IQ in the world ","Stephen Hawking",400);
        questionsAndAnswers[2][1] = new QuestionsAndAnswers("Cl2 is an example of ","Diatomic molecule",600);
        questionsAndAnswers[3][1] = new QuestionsAndAnswers("Plum Pudding model of the Atom (No Punctuation)","JJ Thompson",800);
        questionsAndAnswers[4][1] = new QuestionsAndAnswers("Gravity ","Isaac Newton",1000);
        questionsAndAnswers[0][0] = new QuestionsAndAnswers("The first country to use a nuclear weapon in war","United States of America",200);
        questionsAndAnswers[1][0] = new QuestionsAndAnswers("The war of 1812 was fought between these two countries (Alphabetical Order)","America and Canada",400);
        questionsAndAnswers[2][0] = new QuestionsAndAnswers("The man who conquered most of the world ","Alexander the Great",600);
        questionsAndAnswers[3][0] = new QuestionsAndAnswers("The country of Mummies ","Egypt",800);
        questionsAndAnswers[4][0] = new QuestionsAndAnswers("Death","The holocaust",1000);
                
    }

    /** Returns the question stored at the asked index
     * @param index1 - the row at which the question is located
     * @param index2 - the column at which the question is located
     * @return returns the question located at the asked index
    */
    public String getQuestion (int index1, int index2) {
        return questionsAndAnswers[index1][index2].getQuestion();
    }

    /** Returns the answer stored at the asked index
     * @param index1 - the row at which the answer is located
     * @param index2 - the column at which the answer is located
     * @return returns the answer located at the asked index
    */
    public String getAnswer (int index1, int index2){
        return questionsAndAnswers[index1][index2].getAnswer();
    }

    /** Returns the score of the question at the asked index
     * @param index1 - the row at which the score is located
     * @param index2 - the column at which the score is located
     * @return returns the score of the question at the asked index
    */
    public int getScore (int index1, int index2){
        return questionsAndAnswers[index1][index2].getScore();
    }

    /** Returns the value of the turn instance variable
     * @return returns the value of the turn instance variable
    */
    public int getTurn(){
        return this.turn;
    }

    /** Assigns a value to the turn instance variable
     * @param turn - the integer value that will be assigned to the turn instance variable
    */
    public void setTurn(int turn){
        this.turn = turn;
    }
    
    /** Returns the value stored inside the scoreP1 instance variable
     * @return returns the value stored inside the scoreP1 instance variable
    */
    public int getScoreP1(){
        return this.scoreP1;
    }
    
    /** Assigns a value to the current score of Player 1
     * @param score - the value that will be assigned to the scoreP1 instance variable
    */
    public void setScoreP1(int score){
        this.scoreP1 = score; 
    }
    
    /** Returns the value stored inside the scoreP2 instance variable
     * @return returns the value stored inside the scoreP2 instance variable
    */
    public int getScoreP2(){
        return this.scoreP2;
    }
    
    /** Assigns a value to the current score of Player 2
     * @param score - the value that will be assigned to the scoreP2 instance variable
    */
    public void setScoreP2(int score){
        this.scoreP2 = score; 
    }
    
    /** Returns the value stored inside the scoreP3 instance variable
     * @return returns the value stored inside the scoreP3 instance variable
    */
    public int getScoreP3(){
        return this.scoreP3;
    }
    
    /** Assigns a value to the current score of Player 3
     * @param score - the value that will be assigned to the scoreP3 instance variable
    */
    public void setScoreP3(int score){
        this.scoreP3 = score; 
    }
    
    
}
