public class SkyView {
    private double[][] view;

    public SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        
        if (scanned.length != (numberOfRows * numberOfCols)) {
            throw new IllegalArgumentException("Given scan cannot fit inside desired 2d matrix");
        }

        view = new double[numberOfRows][numberOfCols];
        int scannedIndex = 0;
        while (scannedIndex < scanned.length) {
            for (int r = 0; r < view.length; r++) {
                if (r % 2 == 0) {
                    for (int c = 0; c < view[r].length; c++) {
                        view[r][c] = scanned[scannedIndex];
                        scannedIndex++;
                    }
                } else {
                    for (int c = view[r].length - 1; c >= 0; c--) {
                        view[r][c] = scanned[scannedIndex];
                        scannedIndex++;
                    }
                }
            }
        }


    }

    public double[][] getView() {
        return view;
    }

    public void setView(double[][] view) {
        this.view = view;
    }

    public String toString() {
        String result = "";
        for (int r = 0; r < view.length; r++) {
            for (int c = 0; c < view[r].length; c++) {
                result += view[r][c] + " ";
            }
            result += "\n";
        }
        return result;
    }

    public boolean equals(SkyView other) {
        if (view.length != other.getView().length || view[0].length != other.getView()[0].length) {
            return false;
        }
        
        for (int r = 0; r < view.length; r++) {
            for (int c = 0; c < view[r].length; c++) {
                if (view[r][c] != other.getView()[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        //inclusive
        
        if (startRow < 0 || startRow >= view.length
            || endRow < 0 || endRow >= view.length
            || startCol < 0 || startCol >= view.length
            || endCol < 0 || endCol >= view.length
            || endRow <= startRow || endCol <= startCol
        ) {
            throw new IllegalArgumentException("Dimensions of desired" 
                + "section are outside 2d matrix");
        } //these are just all the preconditions that may happen

        double sum = 0.0;
        int count = 0;
        for (int r = startRow; r <= endRow; r++) {
            for (int c = startCol; c <= endCol; c++) {
                sum += view[r][c];
                count++;
            }
        }
        return sum / count;
    }
}
