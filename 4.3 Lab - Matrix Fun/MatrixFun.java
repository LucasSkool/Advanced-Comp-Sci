public class MatrixFun {
    
    private int[][] matrix;

    MatrixFun(int numberOfRows, int numberOfCols) {
        
        if (numberOfRows < 1) {
            throw new IllegalArgumentException("Cannot have negative # of rows");
        }

        if (numberOfCols < 1) {
            throw new IllegalArgumentException("Cannot have negative # of cols");
        }
        
        matrix = new int[numberOfRows][numberOfCols];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = (int) (Math.random() * 10);
            }
        }
    }

    MatrixFun(int[][] starterMatrix) {
        matrix = starterMatrix;
    }

    MatrixFun() {
        this.matrix = new int[3][3];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                this.matrix[r][c] = (int) (Math.random() * 10);
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public String toString() {
        String result = "";

        for (int i = 0; i < (this.getMatrix()[0].length) * 2 - 1; i++) {
            result += "=";
        } //this just adds the appropriate equal line

        result += "\n";

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                result += matrix[r][c] + " ";
            }
            result += "\n";
        }

        for (int i = 0; i < (this.getMatrix()[0].length) * 2 - 1; i++) {
            result += "=";
        }

        return result;
    }

    public boolean equals(MatrixFun other) {
        return (this.toString()).equals(other.toString());

        /*if (this.getMatrix().toString().equals(other.getMatrix().toString())) {
            return true;
        }
        return false; */
    }

    public boolean equals(int[][] other) {
        if (this.matrix.length != other.length || this.matrix[0].length != other[0].length) {
            return false;
        }
        
        for (int r = 0; r < this.matrix.length; r++) {
            for (int c = 0; c < this.matrix[r].length; c++) {
                if (matrix[r][c] != other[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int r = 0; r < this.matrix.length; r++) {
            for (int c = 0; c < this.matrix[r].length; c++) {
                if (this.matrix[r][c] == oldValue) {
                    this.matrix[r][c] = newValue;
                }
            }
        }
    }

    public void swapRow(int rowA, int rowB) {
        if (rowA >= matrix.length || rowB >= matrix.length || rowA < 0 || rowB < 0) {
            throw new IllegalArgumentException("rowA or rowB is outside matrix index bounds");
        }
        
        int[] tempArr = this.matrix[rowA];
        this.matrix[rowA] = this.matrix[rowB];
        this.matrix[rowB] = tempArr;
    }

}
