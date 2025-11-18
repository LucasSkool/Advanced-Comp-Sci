public class Course {
    
    private String courseName;
    private StudentRecord[] enrolledStudents;

    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public String toString() {
        String result = "== " + courseName + " ==\n";
        for (int i = 0; i < enrolledStudents.length; i++) {
            result += (i + 1) + ".) " + enrolledStudents[i].toString() + "\n";
        }

        return result;
    }

    public String findBestStudent() {
        int bestIndex = 0;
        for (int i = 1; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i].getFinalAverage()
                > enrolledStudents[bestIndex].getFinalAverage()) {
                bestIndex = i;
            }
        }
        return enrolledStudents[bestIndex].getName();
    }

    public double calculateTestAverage(int testNumber) {
        int sum = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            sum += enrolledStudents[i].getScores()[testNumber];
        }

        return (double) sum / enrolledStudents.length;
    }
}
