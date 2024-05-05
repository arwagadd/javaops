package javaoperations;

public class MatrixAddition {
	
	
	public static int[][] addMatrices(int[][] a,int[][] b) {
		int[][] c = new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		return c;
	}
	
	public static int[][] multiplyMatrices(int[][] a,int[][] b) {
		int[][] c = new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				c[i][j] = a[i][j]*b[i][j];
			}
		}
		return c;
	}
	

	public static void main(String[] args) {
		
		System.out.println("Matrix 1:");
		int[][] m1 = {{1,0,3} , {8,2,3}};
		for(int i=0;i<m1.length;i++) {
			for(int j=0;j<m1[0].length;j++) {
				System.out.print(m1[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Matrix 2:");
		int[][] m2 = {{4,1,6} , {3,6,7}};
		for(int i=0;i<m2.length;i++) {
			for(int j=0;j<m2[0].length;j++) {
				System.out.print(m2[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Addition of Matrix 1 and 2");
		int m3[][] = addMatrices(m1,m2);
		for(int i=0;i<m3.length;i++) {
			for(int j=0;j<m3[0].length;j++) {
				System.out.print(m3[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Multiplication of Matrix 1 and 2");
		int m4[][] = multiplyMatrices(m1,m2);
		for(int i=0;i<m4.length;i++) {
			for(int j=0;j<m4[0].length;j++) {
				System.out.print(m4[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
	}
	

}
