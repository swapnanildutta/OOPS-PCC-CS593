import java.util.Scanner;

public class MatrixOP{ 
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int c = scanner.nextInt();
        int i,j,k;
        int[][] matrix1 =new int[r][c];
        int[][] matrix2 =new int[r][c];
        int[][] addMatrix =new int[r][c];
        int[][] subMatrix =new int[r][c];
        int[][] mulMatrix =new int[r][c];
           
        System.out.println("Enter the elements in first matrix :");
        for (i=0;i<r;i++){
            for (j=0;j<c;j++){
                matrix1[i][j] =scanner.nextInt();
            }
        }
        System.out.println("Enter the elements in second matrix:");
        for (i=0;i<r;i++) {
            for (j=0;j<c;j++) {
                matrix2[i][j] =scanner.nextInt();
            }
        }
        for (i=0;i<r;i++) {
            for(j=0;j<c;j++){
                addMatrix[i][j] =matrix1[i][j] + matrix2[i][j];
            }
        }    
        for (i=0;i<r;i++){
            for(j=0;j<c;j++){
                subMatrix[i][j] =matrix1[i][j]-matrix2[i][j];
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                mulMatrix[i][j]=0;
                for(k=0;k<r;k++)
                    mulMatrix[i][j]=mulMatrix[i][j]+matrix1[i][k]*matrix2[k][j];
            }
        }
        System.out.println("\nFirst matrix: ");
        for (i=0;i<r;i++){
            for (j=0;j<c;j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nSecond matrix: ");
        for (i=0;i<r;i++){
            for (j=0;j<c;j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nSum: ");
        for (i=0;i<r;i++){
            for (j=0;j<c;j++){
                System.out.print("\t"+addMatrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nSubstraction: ");
        for (i=0;i<r;i++){
            for (j=0;j<c;j++){
                System.out.print("\t"+subMatrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nMultiplication: ");
        for (i=0;i<r;i++){
            for (j=0;j<c;j++){
                System.out.print("\t"+mulMatrix[i][j]);
            }
            System.out.println();
        }
    }
}