import java.util.ArrayList;

public class TestResults {
    ArrayList<String> answerKey;
    ArrayList<StudentAnswerSheet> submissions;

    public TestResults(ArrayList<String> key, ArrayList<StudentAnswerSheet> submissions) {
        if (key == null || submissions == null) {
            throw new IllegalArgumentException("One or both constructor parameters is/are null");
        }
        this.answerKey = key;
        this.submissions = submissions;

        
    }

    public ArrayList<String> getAnswerKey() {
        return answerKey;
    }

    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return submissions;
    }

    public void setAnswerKey(ArrayList<String> answerKey) {
        this.answerKey = answerKey;
    }

    public void setSubmissions(ArrayList<StudentAnswerSheet> submissions) {
        this.submissions = submissions;
    }

    
    public void submit(StudentAnswerSheet student) {
        submissions.add(student);
    }

    public void gradeTests() {
        for (StudentAnswerSheet submission : submissions) {
            if (submission.getAnswers().size() != answerKey.size()) {
                throw new IllegalArgumentException("Reached a submission with incorrect amount of answers");
            } //precondition
            submission.setTestScore(submission.getGrade(answerKey));
        }
    }

    public String highestScoringStudent() {
        if (submissions.size() < 1) {
            return "";
        } //precondition
        
        String highScorer = "";
        double highScorerScore = 0.0;

        for (StudentAnswerSheet submission : submissions) {
            if (submission.getTestScore() > highScorerScore) {
                highScorer = submission.getName();
                highScorerScore = submission.getTestScore();
            }
        }

        return highScorer;

    }

}
