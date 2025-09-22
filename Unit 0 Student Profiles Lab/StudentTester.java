public class StudentTester {
    
    public static void main(String[] args) {

        Student demir = new Student("Demir Goksu");
        Student isabel = new Student("Isabel Erlic");
        Student lucas = new Student("Lucas Yu", 11);
        Student max = new Student("Max Ye", 11);

        

        System.out.println(demir.toString());
        System.out.println(isabel.toString());
        System.out.println(lucas.toString());
        System.out.println(max.toString());
        //just printing all objects

        demir.setGrade(12);
        isabel.setGrade(12);
        lucas.setGrade(11);
        max.setGrade(11);
        //this should promote everyone up one grade

        System.out.println(demir.toString());
        System.out.println(isabel.toString());
        System.out.println(lucas.toString());
        System.out.println(max.toString());
        //all grades should have been promoted by 1 grade

        System.out.println(max.equals(lucas));
        //this should return false since lucas does not equal max, the names are different


    }

}
