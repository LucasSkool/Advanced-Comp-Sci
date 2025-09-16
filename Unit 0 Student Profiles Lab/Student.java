public class Student {
    
    private String name;
    private int id1;
    private int id2;
    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.id1 = 000;
        this.id2 = 0000;
        this.grade = grade;
    }

    public Student(String name) {
        this.name = name;
        this.id1 = 000;
        this.id2 = 0000;
        this.grade = "10th";
    }

    public String getName() {
        return name;
    }

    public int getId1() {
        return id1;
    }

    public int getId2() {
        return id2;
    }

    public String getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id1, int id2) {
        this.id1 = id1;
        this.id2 = id2;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String toString() {
        return name + " is a " + grade + " grade student. Their ID is " + id1 + "-" + id2;
    }

    public boolean equals(Student other) {
        if(this.name == other.getName() && this.id1 == other.getId1() && this.id2 == other.getId2() && this.grade == other.getGrade()) {
            return true;
        }
        return false;
    }
}
