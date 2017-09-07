/** Object for Questions and Answers 
 * ICS4U1
 * @author - Anshul Patel
 * @since 06/06/2015
 */

package jeopardy;

public class QuestionsAndAnswers {

    //Instance variables needed for this object class
    private String question;
    private String answer;
    private int score;

    /**Creates a new Questions and Answers object
     *@param question - the question that the user will be asked
     *@param answer - the correct answer that the user must enter
     *@param score - the points given to the user if the answer is correct
    */
    public QuestionsAndAnswers(String question, String answer, int score){
        this.question = question;
        this.answer = answer;
        this.score = score;
    }

    /** Returns the value inside the question instance variable
     * @return returns the value stored in the question instance variable
    */
    public String getQuestion(){
        return this.question;
    }

    /** Assigns a value to the question instance variable
     * @param question - The string value that will be assigned to the question instance variable
    */
    public void setQuestion(String question){
        this.question = question;
    }

    /** Returns the value stored inside the answer instance variable
     * @return returns the value stored inside the answer instance variable
    */
    public String getAnswer(){
        return this.answer;
    }

    /** Assigns a value to the answer instance variable
     * @param answer - The string value that will be assigned to the answer instance variable
    */
    public void setAnswer(String answer){
        this.answer = answer;
    }

    /** Returns the value stored inside the score instance variable
     * @return returns the value stored inside the score instance varialbe
    */
    public int getScore(){
        return this.score;
    }

    /** Assigns a value to the score instance variable
     * @param score - the integer value that will be assigned to the score instance variable
    */
    public void setScore(int score){
        this.score = score; 
    }
}
