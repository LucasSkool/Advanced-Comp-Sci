public class StudentRecord {
    // instance variables
    private String name;
    private int[] scores;

    // constructors
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // getters
    // to-do: implement getters

    public String getName() {
        return name;
    }

    public int[] getScores() {
        return scores;
    }

    // to-do: implement getTestScore

    public void setName(String name) {
        this.name = name;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }



    

    // inherited methods
    // to-do: implement toString

    public String toString() {
        String result = name + "'s scores: [";
        for (int i = 0; i < scores.length; i++) {
            result += scores[i] + ", ";
        }
        result = result.substring(0, result.length() - 2) + "]";

        return result;
    }

    public boolean equals(StudentRecord other) {
        // boolean result = true;
        if (this.name != other.getName()) {
            return false;
        }
        for (int i = 0; i < scores.length; i++) {
            if (this.scores[i] != other.getScores()[i]) {
                return false;
            }
        }

        return true;

    }


    // methods

    public double getAverage(int first, int last) {
        int sum = 0;
        int numCount = 0;
        for (int i = first; i <= last; i++) { // i  don't know if this should be <= or <
            sum += scores[i];
            numCount++;
        }

        return (double) sum / numCount;
    }
    /*
     * returns the average (arithmetic mean) of the values in scores
     * precondition: 0 <= first < last < scores.length
     * 
     * @param first - the first index of the scores array
     * 
     * @param last - the last index of the scores array
     * 
     * @return the double average of the values in scores
     */
    
    public int getTestScore(int testNumber) {
        if (testNumber < 0 || testNumber > scores.length - 1) {
            return -1; //IDK IF THIS IS WHAT THEY WANT
        }
        
        return scores[testNumber];
    }


    /*
     * Determines if each successive value in scores is greater
     * than or equal to the previous value
     * 
     * @return true if student has improved, false otherwise
     */
    public boolean hasImproved() {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
        
    }

    /*
     * The method determines if the student has improved and returns the average
     * score appropriately:
     * If the student has improved, returns the average
     * of the top half of the scores array.
     * Otherwise, returns the average of all of the values in scores
     * 
     * @return the double average of test scores
     */


    public double getFinalAverage() {

        if (this.hasImproved()) {
            return this.getAverage(scores.length / 2, scores.length - 1);
        }
        
        return this.getAverage(0, scores.length - 1);
    }

}