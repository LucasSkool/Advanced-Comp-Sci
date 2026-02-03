import java.util.ArrayList;

public class StudentAnswerSheet {
    private String name;
    private double testScore;
    private ArrayList<String> answers;

    public StudentAnswerSheet(String name, ArrayList<String> answers) {
        if (name == null || answers == null) {
            throw new IllegalArgumentException("One constructer parameter is null");
        }
        this.name = name;
        this.answers = answers;
        testScore = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getTestScore() {
        return testScore;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }


    public double getGrade(ArrayList<String> key) {
        if (key == null || answers == null) {
            throw new IllegalArgumentException("Key or Answers is null");
        }
        if (key.size() != answers.size()) {
            throw new IllegalArgumentException("Answers and key are not the same size");
        }

        double grade = 0.0;
        
        for (int i = 0; i < key.size(); i++) {
            if (key.get(i).equals(answers.get(i)) 
                    && !key.get(i).equals("?")
                    && !answers.get(i).equals("?")) {
                grade += 1.0;
            } else if (!key.get(i).equals(answers.get(i))
                    && !key.get(i).equals("?")
                    && !answers.get(i).equals("?")) {
                grade -= 0.25;
            }
        }

        return grade;
    }
}
