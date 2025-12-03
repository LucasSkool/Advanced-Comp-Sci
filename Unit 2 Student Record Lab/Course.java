public class Course {
    
    private String courseName;
    private StudentRecord[] enrolledStudents;

    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName, int maxEnrollment) {
        this.courseName = courseName;
        this.enrolledStudents = new StudentRecord[maxEnrollment];
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

    public boolean isFull() {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void enrollStudent(StudentRecord student) {
        
        boolean foundSeat = false;
        for (int i = 0; i < enrolledStudents.length && !foundSeat; i++) {
            if (enrolledStudents[i] == null) {
                enrolledStudents[i] = student;
                foundSeat = true;
            }
        }
    }

    public boolean dropStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null && enrolledStudents[i].equals(student)) {
                enrolledStudents[i] = null;
                return true;
            }
        }
        return false;
    }

    public int countEnrolledStudents() {
        int count = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                count++;
            }
        }
        return count;
    }

    public void increaseClassSizeBy(int sizeIncrease) {
        StudentRecord[] newClass = new StudentRecord[enrolledStudents.length + sizeIncrease];
        for (int i = 0; i < enrolledStudents.length; i++) {
            newClass[i] = enrolledStudents[i];
        }
        enrolledStudents = newClass;
    }
}
