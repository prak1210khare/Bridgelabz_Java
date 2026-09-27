/*Write a program to perform matrix manipulation operations like addition, subtraction, multiplication, and transpose. Also finding the determinant and inverse of a matrix. The program should take random matrices as input and display the result of the operations.
        Hint =>
Write a Method to create a random matrix taking rows and columns as parameters
Write a Method to add two matrices
Write a Method to subtract two matrices
Write a Method to multiply two matrices

Write a Method to find the transpose of a matrix

Write a Method to find the determinant of a 2x2 matrix
Write a Method to find the determinant of a 3x3 matrix

Write a Method to find the inverse of a 2x2 matrix
Write a Method to find the inverse of a 3x3 matrix
Write a Method to display a matrix
Author: Prakhar Khare
Date: 25-09-2026
 */

package javaMethods.level3;

public class MatrixOperations {
    // Method to create a random matrix
    public static double[][] createRandomMatrix(int rows, int columns) {

        double[][] matrix = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 9) + 1;
            }
        }

        return matrix;
    }

    // Method to add two matrices
    public static double[][] addMatrices(
            double[][] matrix1, double[][] matrix2) {

        int rows = matrix1.length;
        int columns = matrix1[0].length;

        double[][] result = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    // Method to subtract two matrices
    public static double[][] subtractMatrices(
            double[][] matrix1, double[][] matrix2) {

        int rows = matrix1.length;
        int columns = matrix1[0].length;

        double[][] result = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    // Method to multiply two matrices
    public static double[][] multiplyMatrices(
            double[][] matrix1, double[][] matrix2) {

        int rows = matrix1.length;
        int columns = matrix2[0].length;
        int common = matrix1[0].length;

        double[][] result = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                for (int k = 0; k < common; k++) {
                    result[i][j] =
                            result[i][j]
                                    + matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    // Method to find the transpose of a matrix
    public static double[][] transposeMatrix(double[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        double[][] transpose = new double[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    // Method to find determinant of a 2x2 matrix
    public static double findDeterminant2x2(double[][] matrix) {

        return (matrix[0][0] * matrix[1][1])
                - (matrix[0][1] * matrix[1][0]);
    }

    // Method to find determinant of a 3x3 matrix
    public static double findDeterminant3x3(double[][] matrix) {

        double determinant =
                matrix[0][0] * (
                        matrix[1][1] * matrix[2][2]
                                - matrix[1][2] * matrix[2][1]
                )
                        - matrix[0][1] * (
                        matrix[1][0] * matrix[2][2]
                                - matrix[1][2] * matrix[2][0]
                )
                        + matrix[0][2] * (
                        matrix[1][0] * matrix[2][1]
                                - matrix[1][1] * matrix[2][0]
                );

        return determinant;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] findInverse3x3(double[][] matrix) {

        double determinant = findDeterminant3x3(matrix);

        if (determinant == 0) {
            return null;
        }

        double[][] inverse = new double[3][3];

        // Cofactor matrix and transpose
        inverse[0][0] =
                (matrix[1][1] * matrix[2][2]
                        - matrix[1][2] * matrix[2][1]) / determinant;

        inverse[0][1] =
                (matrix[0][2] * matrix[2][1]
                        - matrix[0][1] * matrix[2][2]) / determinant;

        inverse[0][2] =
                (matrix[0][1] * matrix[1][2]
                        - matrix[0][2] * matrix[1][1]) / determinant;

        inverse[1][0] =
                (matrix[1][2] * matrix[2][0]
                        - matrix[1][0] * matrix[2][2]) / determinant;

        inverse[1][1] =
                (matrix[0][0] * matrix[2][2]
                        - matrix[0][2] * matrix[2][0]) / determinant;

        inverse[1][2] =
                (matrix[0][2] * matrix[1][0]
                        - matrix[0][0] * matrix[1][2]) / determinant;

        inverse[2][0] =
                (matrix[1][0] * matrix[2][1]
                        - matrix[1][1] * matrix[2][0]) / determinant;

        inverse[2][1] =
                (matrix[0][1] * matrix[2][0]
                        - matrix[0][0] * matrix[2][1]) / determinant;

        inverse[2][2] =
                (matrix[0][0] * matrix[1][1]
                        - matrix[0][1] * matrix[1][0]) / determinant;

        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%8.2f", matrix[i][j]);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create two random 3x3 matrices
        double[][] matrix1 = createRandomMatrix(3, 3);
        double[][] matrix2 = createRandomMatrix(3, 3);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        // Addition
        double[][] addition = addMatrices(matrix1, matrix2);

        System.out.println("\nAddition of Matrices:");
        displayMatrix(addition);

        // Subtraction
        double[][] subtraction = subtractMatrices(matrix1, matrix2);

        System.out.println("\nSubtraction of Matrices:");
        displayMatrix(subtraction);

        // Multiplication
        double[][] multiplication = multiplyMatrices(matrix1, matrix2);

        System.out.println("\nMultiplication of Matrices:");
        displayMatrix(multiplication);

        // Transpose
        double[][] transpose = transposeMatrix(matrix1);

        System.out.println("\nTranspose of Matrix 1:");
        displayMatrix(transpose);

        // Determinant
        double determinant = findDeterminant3x3(matrix1);

        System.out.println("\nDeterminant of Matrix 1 = " + determinant);

        // Inverse
        double[][] inverse = findInverse3x3(matrix1);

        if (inverse == null) {
            System.out.println("\nMatrix 1 does not have an inverse.");
        } else {
            System.out.println("\nInverse of Matrix 1:");
            displayMatrix(inverse);
        }
    }
}
