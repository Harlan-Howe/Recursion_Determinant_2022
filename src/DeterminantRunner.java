import java.util.Scanner;

public class DeterminantRunner
{

    public static void main(String[] args)
    {
        Scanner keyReader = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");

        int N = keyReader.nextInt();

        if (N<1)
            throw new RuntimeException("Error. Enter a positive integer.");

        int[][] matrix = generateMatrix(N);

        System.out.println("Matrix:");
        for (int[] row: matrix)
        {
            for (int x: row)
                System.out.printf("%4d ",x);
            System.out.println("");
        }

        System.out.println("Copy and paste this into Wolfram Alpha:");
        System.out.print("determinant of {");
        for (int r = 0; r<N; r++)
        {
            System.out.print("{");
            for (int c=0; c<N; c++)
            {
                System.out.print(matrix[r][c]);
                if (c<N-1)
                    System.out.print(",");
            }
            System.out.print("}");
            if (r<N-1)
                System.out.print(",");
        }
        System.out.println("}");

        System.out.print("I calculate the determinant to be: ");
        System.out.println(getDeterminant(matrix));
    }

    public static int[][] generateMatrix(int n)
    {
        int[][] result = new int[n][n];
        for (int r=0; r<n; r++)
            for (int c=0; c<n; c++)
                result[r][c] = (int)(Math.random()*200-100);
        return result;
    }

    public static int getDeterminant(int[][] matrix)
    {
        //TODO: you write this...

        return 0;
    }
}
