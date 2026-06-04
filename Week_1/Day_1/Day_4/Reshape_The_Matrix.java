class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int col=mat[0].length;
        if(row*col!=r*c)
        {
            return mat;
        }
        if(row==r&&col==c)
        {
            return mat;
        }
        int m=0;
        int n=0;
        int [][]result= new int[r][c];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                result[m][n]= mat[i][j];
                n++;

                if (n== c) {
                    n = 0;
                    m++;
                }
            }
        }
        return result;
    }
}
