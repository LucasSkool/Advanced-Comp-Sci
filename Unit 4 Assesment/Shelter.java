import java.util.ArrayList;

public class Shelter {
    // instance variables
    private Dog[][] kennels;

    // constructors
    public Shelter(int rows, int cols) {
        if (rows < 1 || cols < 1) {
            throw new IllegalArgumentException("Constructor parameters illegal");
        } //precondition
        
        kennels = new Dog[rows][cols];
    }

    /* initializes kennels as a 3x3 2D array */
    public Shelter() {
        kennels = new Dog[3][3];
    }

    // getters and setters
    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        this.kennels = kennels;
    }

    // methods

    /*
     * prints out the 2D array 'kennels', displaying the dog's info if the kennel is occupied, or
     * 'empty' if the kennel is empty
     */
    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void add(Dog animal) {
        if (animal == null) {
            throw new IllegalArgumentException("Parameter animal cannot be null");
        }
        
        boolean kennelFound = false;
        for (int r = 0; r < kennels.length && !kennelFound; r++) {
            for (int c = 0; c < kennels[r].length && !kennelFound; c++) {
                if (kennels[r][c] == null) {
                    kennels[r][c] = animal;
                    kennelFound = true;
                }
            }
        }
        if (!kennelFound) {
            System.out.println("No empty kennels.");
        }
    }


    public void add(Dog animal, int row, int col) {
        if (animal == null) {
            throw new IllegalArgumentException("Parameter animal cannot be null");
        }
        if (row < 0 || col < 0 || row >= kennels.length || col >= kennels[0].length) {
            throw new IllegalArgumentException("Kennel indexes illegal");
        } //precondition

        if (kennels[row][col] == null) {
            kennels[row][col] = animal;
        } else {
            add(animal);
        }
    }

    public void add(ArrayList<Dog> animals) {
        if (animals == null) {
            throw new IllegalArgumentException("Parameter animals cannot be null");
        }
        for (Dog dawg : animals) {
            add(dawg);
        }
    }

    public Dog adopt(int row, int col) {
        if (row < 0 || col < 0 || row >= kennels.length || col >= kennels[0].length) {
            throw new IllegalArgumentException("Kennel indexes DNE");
        } //precondition

        if (kennels[row][col] == null) {
            throw new IllegalArgumentException("There is no dog at the given coordinates.");
        }
        Dog result = kennels[row][col];
        kennels[row][col] = null;
        return result;
    }

    public ArrayList<Dog> search(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null.");
        } //precondition
        ArrayList<Dog> result = new ArrayList<Dog>();
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels.length; c++) {
                if (kennels[r][c].getName().equals(name)) {
                    result.add(kennels[r][c]);
                }
            }
        }
        return result;
    }

    public ArrayList<Dog> search(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        ArrayList<Dog> result = new ArrayList<Dog>();
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels.length; c++) {
                if (kennels[r][c].getAge() == age) {
                    result.add(kennels[r][c]);
                }
            }
        }
        return result;

    }
}
