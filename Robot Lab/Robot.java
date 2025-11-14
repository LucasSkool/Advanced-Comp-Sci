public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    public Robot(int[] hallwayToClean, int startingPosition) {
        this.hallway = validateHall(hallwayToClean);
        this.position = validatePosition(startingPosition);
        this.isFacingRight = true;
    }

    public int[] getHallway() {
        return hallway;
    }

    public int getPosition() {
        return position;
    }

    public boolean isFacingRight() {
        return isFacingRight;
    }

    public void setHallway(int[] hallway) {
        this.hallway = validateHall(hallway);
    }

    public void setPosition(int position) {
        this.position = validatePosition(position);
    }

    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        return ((position == hallway.length - 1 && isFacingRight) || (position == 0 && !isFacingRight));
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        if (hallway[position] > 0) {
            pickup();
        }

        if (hallway[position] == 0 && !isRobotBlockedByWall()) {
            moveForward();
        } else if (hallway[position] == 0 && isRobotBlockedByWall()) {
            turnAround();
        }

    }

    public void pickup() {
        hallway[position]--;
    }

    public void turnAround() {
        if (isFacingRight) {
            isFacingRight = false;
        } else {
            isFacingRight = true;
        }
    }

    public void moveForward() { //does not account for if there is a wall.
        if (isFacingRight) {
            position++;
        } else {
            position--;
        }
    }

    /**
     * This method displays the current state of the robot and the hallway. It then
     * calls the move() method and counts the number of moves it takes to clear the
     * hallway. The method should display the current state of the robot after each
     * move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {

        int count = 0;
        
        while (!hallIsClear()) {
            displayState(); //prints what is there
            move();
            count++;
            System.out.println("\n"); // "enter" twice
        }

        displayState();
        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        int sum = 0;
        for (int i = 0; i < hallway.length; i++) {
            sum += hallway[i];
        }
        return (sum == 0);
    }

    public int[] validateHall(int[] hallway) {
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] < 0) {
                hallway[i] = 0;
            }
        }
        return hallway;
    }

    public int validatePosition(int position) {
        if (position > hallway.length - 1) {
            return hallway.length - 1;
        } else if (position < 0) {
            return 0;
        }
        return position;
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        for (int i = 0; i < hallway.length; i++) {
            System.out.print(hallway[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < position * 2; i++) {
            System.out.print(" ");
        }

        if (isFacingRight) {
            System.out.print(">");
        } else {
            System.out.print("<");
        }

    }

}
