public class HubTester {
    public static void main(String[] args) {

        // ----------------------------------- Student -----------------------------------
        System.out.println("STUDENT");
        System.out.println();
        // Student testStudent = new Student("Lucas", "secure", "lyu1@hwemail.com");

        try {
            new Student("", "secure", "lyu1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            new Student("Lucas One", "", "lyu1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            new Student("Lucas Two", "secure", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            new Student("Luc@s Three", "secure", "lyu1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            new Student("Lucas Four", "hello32", "lfour1@hwemail.com");
            new Student("Lucas Four", "secure", "lfour2@hwemail.com");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Student testStudent = new Student("Lucas Five", "secure", "lyu1@hwemail.com");
            testStudent.changeName("");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Student testStudent = new Student("Lucas Six", "secure", "lyu1@hwemail.com");
            testStudent.changeName("Luca@s Six");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            new Student("Hank One", "nerd", "hone1@oakwoodschool.org");
            Student testStudent = new Student("Lucas Seven", "secure", "lseven1@hwemail.com");
            testStudent.changeName("Hank One");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Student testStudent = new Student(null, "secure", "hone1@oakwoodschool.org");
            testStudent.resetPassword();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Student testStudent = new Student("boutabeNULL", "secure", "hone1@oakwoodschool.org");
            testStudent.name = null;
            testStudent.resetPassword();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            new Student("MrBad", "Evil", "mbadhwemaicom");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // ----------------------------------- Hub -----------------------------------
        System.out.println();
        System.out.println("HUB");
        System.out.println();

        Hub testHub = new Hub();

        try {
            testHub.registerStudent("", "passpass", "bben@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            testHub.registerStudent("Ben One", "", "bben@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            testHub.registerStudent("Ben Two", "passpass", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            testHub.registerStudent("B@n Three", "passpass", "bben@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            testHub.registerStudent("Ben Four", "passpass", "bfour@hwemail.com");
            testHub.registerStudent("Ben Four", "passpass", "bfour@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            testHub.setStudents(null);
            testHub.registerStudent("Ben Five", "passpass", "bfour@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            testHub.loginStudent("", "passpass");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            testHub.loginStudent("useruser", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Student hubStudent = new Student("Runshi", "feet", "rliu1@hwemail.com");
            Student[] studentArr = new Student[] {hubStudent};
            testHub.setStudents(studentArr);

            testHub.loginStudent("nonexistentuser", "idunno");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            testHub.registerStudent("Max Ye", "touch", "mye1@hwemail.com");

            testHub.loginStudent("Max Ye", "idunno");
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            testHub.doesStudentExist("Max Ye");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            testHub.setStudents(null);
            testHub.loginStudent("Someonenew", "jane");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }




        // ----------------------------------- Assignment -----------------------------------

        System.out.println();
        System.out.println("ASSIGNMENT");
        System.out.println();

        Assignment homeReading = new Assignment("Foner Reading", "Read Foner pages 554 - 560");
       
        try {
            homeReading.setTitle("Foner Homework Reading");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            homeReading.setDescription("Read Foner pages 554 - 560 and 564");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            homeReading.getTitle();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            homeReading.getDescription();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            homeReading.getDescriptionLength();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

    }

}
