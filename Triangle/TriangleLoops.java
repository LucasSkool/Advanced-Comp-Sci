public class TriangleLoops {

    /*
     * The method returns a String by creating rows of letters. Each row prints a
     * number of letters equal to the row number. The total number of rows printed
     * is determined by numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @param letter the letter to be printed
     * @return a String of letters in the shape of a triangle
     */

    // to-do: implement createLetterTriangleUp
    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        String triangle = "";
        int k = 1;
        while (k <= numberOfRows) {
            for (int i = 0; i < k; i++) {
                triangle += letter;
            }
            triangle += "\n";
            k++;
        }
        return triangle;
    }

    /*
     * The method returns a String by creating rows of letters. Each row prints a
     * number of letters equal to the total number of rows, descending downward. The
     * total number of rows printed is determined by numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @param letter the letter to be printed
     * @return a String of letters in the shape of a triangle
     */
    // to-do: implement createLetterTriangleDown
    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        String triangle = "";
        int k = numberOfRows;
        while (k >= 1) {
            for (int i = 0; i < k; i++) {
                triangle += letter;
            }
            triangle += "\n";
            k--;
        }
        return triangle;
    }

    /*
     * This method returns a String of a number triangle. The number of rows in the
     * triangle is determined by the numberOfRows, and the number used in each row
     * is determined by the row number.
     * @param numberOfRows the number of rows in the triangle
     * @return a String of numbers in the shape of a triangle
     */
    // to-do: implement createNumbersTriangle
    public static String createNumbersTriangle(int numberOfRows) {
        String triangle = "";
        int k = 1;
        while (k <= numberOfRows) {
            for (int i = 0; i < k; i++) {
                triangle += k + " ";
            }
            triangle += "\n";
            k++;
        }
        return triangle;
    }

    /*
     * The method returns a String by creating a pyramid pattern using the alphabet.
     * The method determines the height of the pyramid by using the int
     * numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @return a String of letters in the shape of a pyramid
     */
    // to-do: implement createAlphabetTriangle
    public static String createAlphabetTriangle(int numberOfRows) {
        if (numberOfRows > 26) {
            numberOfRows = 26;
        }
        
        String triangle = "";
        for (int k = 1; k <= numberOfRows; k++) {
            for (int i = 0; i < numberOfRows - k; i++) {
                triangle += " ";
            }
            int alph = 65; //65 == 'A'
            for (int j = 0; j < k; j++) {
                triangle += (char) alph;
                alph++;
            }
            alph -= 2;
            for (int j = 0; j < k - 1; j++) {
                triangle += (char) alph;
                alph--;
            }

            triangle += "\n";
        }
        
        return triangle;
    }

}