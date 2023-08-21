import java.util.Scanner;
public class Matcal{
public static void main(String[] args){

	Scanner input = new Scanner(System.in); 

	System.out.print("Enter the number of rows: ");
      int rows = input.nextInt();
      System.out.print("Enter the number of columns: ");
      int columns = input.nextInt();

	int[][] MatA = new int[rows][columns];
	int[][] MatB = new int[rows][columns];
	int[][] MatC = new int[rows][columns];
	int[][] MatP = new int[rows][columns];

	System.out.println("Enter elements of Matrix A:");
      Matins(MatA, input);

      System.out.println("Enter elements of Matrix B:");
      Matins(MatB, input);

      Matadd(MatA, MatB, MatC);

      System.out.println("Sum of the matrices:");
      Matdis(MatC);

	Matmul(MatA, MatB, MatP);

	System.out.println("Product of the matrices:");
      Matdis(MatP);
}
public static void Matins(int[][] Mat, Scanner input){
	int rows = Mat.length;
      int columns = Mat[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                Mat[i][j] = input.nextInt();
            }
        }
}

public static void Matmul(int[][] MatA, int[][] MatB, int[][] MatP) {
        int rows = MatA.length;
        int columns = MatA[0].length;

	   for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
		    MatP[i][j] = MatA[i][j]
	 	  }
	   }
     }

public static void Matadd(int[][] MatA, int[][] MatB, int[][] MatC) {
        int rows = MatA.length;
        int columns = MatA[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                MatC[i][j] = MatA[i][j] + MatB[i][j];
            }
        }
    }

public static void Matdis(int[][] Mat) {
        int rows = Mat.length;
        int columns = Mat[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(Mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}