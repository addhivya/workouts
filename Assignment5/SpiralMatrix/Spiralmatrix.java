package Assignment5.SpiralMatrix;

import java.util.*;

public class Spiralmatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        return spiralOrder(matrix, 0, matrix.length - 1, 0, matrix[0].length - 1);
    }

    private List<Integer> spiralOrder(int matrix[][], int rowstart, int rowend, int colstart, int colend) {
        List list = new ArrayList();
        while (rowstart <= rowend || (colstart <= colend && rowstart <= rowend)) {
            for (int i = colstart; i <= colend; i++) {
                list.add(matrix[rowstart][i]); //adds first row
            }
            rowstart++;
            if (rowstart > rowend) {
                colstart++;
            } else if (colstart > colend) {
                rowstart++;
            }
            if (colstart <= colend) {
                for (int i = rowstart; i <= rowend; i++) {
                    list.add(matrix[i][colend]); //adds last column
                }
                colend--;
            }

            if (colstart <= colend) {
                for (int i = colend; i >= colstart; i--) {
                    list.add(matrix[rowend][i]); //adds last row
                }
                rowend--;
            }
            if (colstart > colend) {
                rowstart++;
            } else if (rowstart > rowend) {
                colstart++;
            }
            if (rowstart <= rowend) {
                for (int i = rowend; i >= rowstart; i--) {
                    list.add(matrix[i][colstart]);  //adds first column
                }
                colstart++;
            }
        }
        return list;
    }

    public static void main(String args[]) {
        int m = 0;
        int matrix[][] = new int[4][3];
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] = m);
                System.out.print("  ");
                m++;
            }
        }
        System.out.println();
        Spiralmatrix s = new Spiralmatrix();
        List list = s.spiralOrder(matrix);
        System.out.println("Spiral Matrix Result:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print("  ");
        }
    }
}

