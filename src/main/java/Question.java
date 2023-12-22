import java.util.ArrayList;
import java.util.HashMap;

public abstract class Question {

    private String questionBody;

    //private HashMap<Boolean, String> answerChoices;

    private String userAnswer;

    private String questionType;

    private int pointValue;


    public Question(String questionBody, String userAnswer, String questionType, int pointValue) {
        this.questionBody = questionBody;
        this.userAnswer = userAnswer;
        this.questionType = questionType;
        this.pointValue = pointValue;
    }

//    public Question() {
//        this.questionBody = "Text of question body";
//    }


    public String getQuestionBody() {
        return questionBody;
    }

    public void setQuestionBody(String questionBody) {
        this.questionBody = questionBody;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public void displayQuestion() {
        System.out.println(this.questionBody);
    }

    public abstract int getAnswers();

    public abstract void displayAnswers();

}
