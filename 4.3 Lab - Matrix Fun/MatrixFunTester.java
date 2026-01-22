public class MatrixFunTester {
    public static void main(String[] args) {

        System.out.println("1st Matrix");
        MatrixFun newMatrix = new MatrixFun();
        System.out.println(newMatrix.toString());

        System.out.println();
        System.out.println("2nd Matrix");
        MatrixFun newMatrix2 = new MatrixFun();
        System.out.println(newMatrix2.toString());

        System.out.println("Equals?: " + newMatrix.equals(newMatrix2));

        MatrixFun sameMatrixFun = newMatrix;

        System.out.println("Equals?: " + newMatrix.equals(sameMatrixFun));

        newMatrix.replaceAll(2, 5);
        System.out.println(newMatrix.toString()); // just keep running the code until a 2 appears

        newMatrix.swapRow(2, 0);
        System.out.println(newMatrix.toString());

    }
}
