package Assignment5.SpiralMatrix;


import java.util.List;

public class MatrixUnitTest {
    Spiralmatrix matrix;

    public MatrixUnitTest() {
        this.matrix = new Spiralmatrix();
    }

    public void spiralOrderTest() throws UnitTestFailureException {
        int input[][][] = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{1, 2}, {3, 4}, {5, 6}}};
        int[][] output = {{1, 2, 3, 6, 9, 8, 7, 4, 5}, {1, 2, 4, 6, 5, 3}};

        for (int k = 0; k < input.length; k++) {
            List<Integer> actualoutput = matrix.spiralOrder(input[k]);

            for (int j = 0; j < actualoutput.size(); j++) {
                if (actualoutput.get(j) != output[k][j]) {
                    throw new UnitTestFailureException("Expected " + output[k][j] + " but result was " + actualoutput.get(j));
                }
            }
        }
        System.out.println("Unit CatTest passed!!");
    }

    public static void main(String[] args) throws UnitTestFailureException {
        MatrixUnitTest test = new MatrixUnitTest();
        test.spiralOrderTest();
    }
}
