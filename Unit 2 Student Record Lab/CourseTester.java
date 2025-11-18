public class CourseTester {
    public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord("Lucas Yu", new int[]{85, 100, 96});
        StudentRecord student2 = new StudentRecord("Max Ye", new int[]{77, 85, 92});
        StudentRecord student3 = new StudentRecord("Demir Goksu", new int[]{80, 85, 83});
        StudentRecord student4 = new StudentRecord("Runshi Liu", new int[]{90, 82, 79});

        System.out.println("== Students ==");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());

        System.out.println("\n== Testing getAverage() ==");
        System.out.println("Lucas's test average between 1 and 2: " + student1.getAverage(1, 2));

        System.out.println("\n== Testing getTestScore() ==");
        System.out.println("Max's 2nd score: " + student2.getTestScore(1));

        

    }
}
