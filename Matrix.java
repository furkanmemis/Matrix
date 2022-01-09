import java.util.*;

public class Matrix {
    /*
        Author : FM
    */


    public static int[][] CreateMatrix(int row,int columns){

        Random rnd = new Random();


        int[][] matrix = new int[row][columns];
        int i,j;

        for(i = 0;i<row;i++){
            for(j = 0;j<columns;j++){

                matrix[i][j] = rnd.nextInt(10);

            }
        }

        return matrix;
    }
    public static void PrintMatrix(int [][] matrix){

        int i,j;

        for(i = 0;i<matrix.length;i++){
            for(j = 0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static int[][] MatrixDot(int [][] matrix1,int [][] matrix2){

        int [][] result_matrix = new int[matrix1.length][matrix2[0].length];

        int i,j,k;

        for(i = 0;i<matrix1.length;i++){
            for(j = 0;j<matrix2[0].length;j++){
                for(k = 0;k<matrix1[0].length;k++){
                    result_matrix[i][j] = result_matrix[i][j] + matrix1[i][k]*matrix2[k][j];
                }

            }
        }
        return result_matrix;
    }
    
    public static int[][] CreateUnitMatrix(int row,int column){

        int [][] unit_matrix = new int[row][column];
        int i,j;


        for(i = 0;i<row;i++){
            for(j = 0;j<column;j++){
                if(i == j){
                    unit_matrix[i][j] = 1;
                }
                else{
                    unit_matrix[i][j] = 0;
                }
            }
        }
        return unit_matrix;
    }

    public static int[][] MatrixTranspose(int [][] matrix){

        int [][] transpose_matrix = new int[matrix[0].length][matrix.length];
        int i,j;


        for(i = 0;i<matrix.length;i++){
            for(j = 0;j<matrix[0].length;j++){
                transpose_matrix[j][i] = matrix[i][j];
            }
        }

        return transpose_matrix;
    }

    public static int [][] MatrixAddition(int [][] matrix1,int [][] matrix2){

        int [][] result_matrix = new int[matrix1.length][matrix1[0].length];
        int i,j;

        for(i = 0;i<matrix1.length;i++){
            for(j = 0;j<matrix1[0].length;j++){
                result_matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result_matrix;
    }

    
    public static void main(String[] args){

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int row1,columns1,row2,columns2;

        System.out.print("Enter yours row-1 number: ");
        row1 = scan1.nextInt();
        System.out.print("Enter yours column-1 number: ");
        columns1 = scan1.nextInt();
        System.out.print("Enter yours row-2 number: ");
        row2 = scan2.nextInt();
        System.out.print("Enter yours column-2 number: ");
        columns2 = scan2.nextInt();
    
        

        int [][] matrix1 = CreateMatrix(row1, columns1);
        int [][] matrix2 = CreateMatrix(row2, columns2);
        /*
        int [][] dot_matrix = MatrixDot(matrix1, matrix2);
        int [][] unit_matrix = CreateUnitMatrix(6,6);
        int [][] transpose_matrix = MatrixTranspose(matrix1);
        */
        int [][] matrix3 = MatrixAddition(matrix1, matrix2);

        System.out.println("Matrix-1");
        PrintMatrix(matrix1);
        System.out.println("");

        System.out.println("Matrix-2");
        PrintMatrix(matrix2);
        System.out.println("");
        System.out.println("Matrix-3");
        PrintMatrix(matrix3);
        System.out.println("");
/*
        System.out.println("Dot-Matrix");
        PrintMatrix(dot_matrix);
        System.out.println("");

        System.out.println("Unit-Matrix");
        PrintMatrix(unit_matrix);
        System.out.println("");

        System.out.println("Transpose-Matrix");
        PrintMatrix(transpose_matrix);
        System.out.println("");
*/


        
    }
}
