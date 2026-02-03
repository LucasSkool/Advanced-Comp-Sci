import java.util.ArrayList;

public class AnswerSheetTester {
    public static void main(String[] args) {
        
        ArrayList<String> lucasAnswers = new ArrayList<String>();
        lucasAnswers.add("A"); //+1.0
        lucasAnswers.add("C"); //-0.25
        lucasAnswers.add("C"); //+1.0
        lucasAnswers.add("A"); //-0.25
        lucasAnswers.add("B"); //+0.0
        StudentAnswerSheet lucas = new StudentAnswerSheet("Lucas", lucasAnswers);

        ArrayList<String> maxAnswers = new ArrayList<String>();
        maxAnswers.add("B"); 
        maxAnswers.add("C"); 
        maxAnswers.add("C"); 
        maxAnswers.add("A"); 
        maxAnswers.add("B"); 
        StudentAnswerSheet max = new StudentAnswerSheet("Max", maxAnswers);

        ArrayList<String> demirAnswers = new ArrayList<String>();
        demirAnswers.add("A"); 
        demirAnswers.add("B"); 
        demirAnswers.add("C"); 
        demirAnswers.add("D"); 
        demirAnswers.add("B"); 
        StudentAnswerSheet demir = new StudentAnswerSheet("Demir", demirAnswers);

        ArrayList<StudentAnswerSheet> classAAnswerSheet = new ArrayList<StudentAnswerSheet>();
        classAAnswerSheet.add(lucas);
        classAAnswerSheet.add(max);
        classAAnswerSheet.add(demir);
        
        
        ArrayList<String> key = new ArrayList<String>();
        key.add("A");
        key.add("B");
        key.add("C");
        key.add("D");
        key.add("?");


        TestResults classA = new TestResults(key, classAAnswerSheet);

        System.out.println();

        classA.gradeTests();;
        System.out.println("Lucas score: " + lucas.getTestScore());
        System.out.println("Max score: " + max.getTestScore());
        System.out.println("Demir score: " + demir.getTestScore());

        System.out.println();

        System.out.println("Highest scoring student: " + classA.highestScoringStudent());

    }
}
