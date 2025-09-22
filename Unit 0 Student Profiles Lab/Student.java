public class Student {
    
    private String name;
    private String id;
    private int grade;
    private Student latestOpp;
    private Student recentFriend;

    public Student(String name, int grade) {
        this.name = name;
        this.id = generateId();
        this.grade = grade;
    }

    public Student(String name) {
        this.name = name;
        this.id = generateId();
        this.grade = 10;
    }

    public Student getLatestOpp() {
        return latestOpp;
    }

    public Student getRecentFriend() {
        return recentFriend;
    }

    public void setLatestOpp(Student latestOpp) {
        this.latestOpp = latestOpp;
    }

    public void setRecentFriend(Student recentFriend) {
        this.recentFriend = recentFriend;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String toString() {
        return name + " is a " + grade + " grade student. Their ID is " + id;
    }

    public boolean equals(Student other) {
        
        if (this.name.equals(other.getName()) && this.id.equals(other.getId())
            && this.grade == other.getGrade()) {
            return true;
        }

        return false;
    }

    public String generateId() {
        String firstPart = "";
        String secondPart = "";

        for (int i = 0; i < 3; i++) {
            firstPart += (int) (Math.random() * 8 + 1);
        }

        for (int i = 0; i < 4; i++) {
            secondPart += (int) (Math.random() * 10);
        }

        return "" + firstPart + "-" + secondPart;
    }

    public String vibeCheck(Student other) {
        
        if (latestOpp.equals(other.getLatestOpp())) {
            this.recentFriend = other;
            other.recentFriend = this;
            return this.name + " and " + other.getName()
                + " are now friends! They both dislike " + this.latestOpp + ".";
        }

        return this.name + " and " + other.getName()
            + " did not become friends. They do not dislike the same person.";
    }

}
