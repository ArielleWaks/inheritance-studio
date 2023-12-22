import java.util.ArrayList;

public class MultipleChoice extends Question {

    private ArrayList<String> answerOptions;

    private int correctAnswer;
    public MultipleChoice(String questionBody, String userAnswer, String questionType, int pointValue, ArrayList<String> answerOptions, int correctAnswer) {
        super(questionBody, userAnswer, questionType, pointValue);
        this.answerOptions = answerOptions;
        this.correctAnswer = correctAnswer;
    }


    @Override
    public void displayAnswers() {
        for (int i=0; i < answerOptions.size(); i++) {
            System.out.println(answerOptions.get(i));
        }
    }

    @Override
    public int getAnswers() {
        return 0;
    }

}
