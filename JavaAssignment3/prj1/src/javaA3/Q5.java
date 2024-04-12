package javaA3;
import java.util.Scanner;

public class Q5{

	public static void main(String[] args) {
		Matrix m1 = new Matrix();
		int mat1[][] = m1.getMatrix();
		int mat2[][] = m1.getMatrix();

		System.out.println("1 st matrix");
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[0].length; j++) {
				System.out.print(mat1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("2nd matrix");
		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2[0].length; j++) {
				System.out.print(mat2[i][j] + " ");
			}
			System.out.println();
		}

		if (mat1.length == mat2.length && mat1[0].length == mat2[0].length) {
			int m3[][] = m1.addMatrix(mat1, mat2);
			System.out.println("addition of matrix:\n");
			for (int i = 0; i < m3.length; i++) {
				for (int j = 0; j < m3[0].length; j++) {
					System.out.print(m3[i][j] + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("matrix is not addable");
		}

	}

}




 class Matrix {
       public int[][] getMatrix() {
    	   Scanner sc=new Scanner(System.in);
    	   int col,row;
    	   System.out.println("enter the number of rows:");
    	   row=sc.nextInt();
    	   System.out.println("enter the number of colum");
    	   col=sc.nextInt();
    	   int mat[][]=new int[row][col];
    	   System.out.println("enter matrix:");
    	   for (int i = 0; i < row; i++) {
    		   for (int j = 0; j < col; j++) {
    			   mat[i][j]=sc.nextInt();
    		   }
		   }
    	   return mat;
    	  }
       
       public int[][] addMatrix( int m1[][],int m2[][]) {
    	   int row=m1.length;
    	   int col=m1[0].length;
    	   int matadd[][]=new int[row][col];
    	   for (int i = 0; i < row; i++) {
    		   for (int j = 0; j < col; j++) {
    			   matadd[i][j]=m1[i][j]+m2[i][j];
    		   }
		   }
    	   
    	   return matadd; 
       }
       
       
       
}
