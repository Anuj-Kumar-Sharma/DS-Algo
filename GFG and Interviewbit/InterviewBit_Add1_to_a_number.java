public class Solution {
    public int[] plusOne(int[] A) {
     ArrayList<Integer> result = new ArrayList<Integer>();
        if (A == null || A.length == 0) {
            int[] temp = {1};
            return temp;
        }
         
        int carry = 0;
        for(int a=0;a<A.length;a++)
        {
            result.add(A[a]);
        }
        for(int b=result.size()-1;b>=0;b--)
        {
            if(result.get(b)+1<10)
            {
                result.set(b,result.get(b)+1);
                break;
            }else if(b>0)
            {
                result.set(b,(result.get(b)+1)%10);
            }else
            {
                result.set(b,0);
                result.add(0,1);
            }
         }
        while(result.get(0)==0)
        {
            result.remove(0);
        }
        int[] ans=new int[result.size()];
        for(int c=0;c<result.size();c++)
        {
            ans[c]=result.get(c);
        }
        return ans;
    }
}

