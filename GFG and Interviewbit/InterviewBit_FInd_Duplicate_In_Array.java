public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int repeatedNumber(final int[] A) {
        int[] ans=new int[A.length];
        int a=-1;
        for(int i=0;i<A.length;i++)
        {
            ans[A[i]]++;
        }
        for(int i=0;i<A.length;i++)
        {
            if(ans[i]>1)
            {
                a=i;
                break;
            }
        }
        return a;
    }
}

