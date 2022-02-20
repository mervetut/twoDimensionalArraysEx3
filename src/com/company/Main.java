package com.company;

public class Main {

    public static void main(String[] args) {
        final int N = 7;
        int[][] A = new int[N][N];

        int k = 1;
        int startRow = 0, startColumn = 0, endRow = 0, endColumn = 0;
        while (k <= N * N) {
            for (int r = startRow, c = startColumn; r <= endRow && c >= endColumn; r++, c--)
            //endRow is 7, and we say it is less than 7 to specify the row number
            {
                A[r][c] = k;
                k++;
            }

            if (startColumn <= N - 2) { //n-2 because it both decreases (goes down) the row and the column
                startColumn++;
                endRow++; //start of the column, the end of the row : the end corner
            } else {
                startRow++;
                endColumn++;
            }
        }
        for (int[] row : A) { //row = each element of array[][] A
            for (int e : row) //e = elements in the row
                System.out.print(e + " ");
            System.out.println("");
        }
    }
}
