class Chain_Matrix_Multi
{
  static int MatrixChainOrder(int a[], int n)
  {
    int m[][] = new int[n][n];
    int i, j, k, l, q;
    for (i = 1; i < n; i++)
    m[i][i] = 0;
    for (l = 2; l < n; l++)
    {
       for (i = 1; i < n - l + 1; i++) 
       {
         j = i + l - 1;
         if (j == n)
         continue;
         m[i][j] = Integer.MAX_VALUE;
         for (k = i; k <= j - 1; k++) 
         {
             q = m[i][k] + m[k + 1][j] + a[i - 1] * a[k] * a[j];
             if (q < m[i][j])
             m[i][j] = q;
         }
       }
    }
     return m[1][n - 1];
   }

    public static void main(String args[])
    {
      int arr[] = new int[] { 1, 2, 3, 4 };
      int size = arr.length;
      System.out.println("Minimum number of multiplications is " + MatrixChainOrder(arr,size));
    }
}