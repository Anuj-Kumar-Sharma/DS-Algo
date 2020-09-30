class Solution {
      public int heightChecker(int[] heights) {
        int[] countArr = new int[101];
        for(int h:heights){
            countArr[h]++;
        }
        int res=0;
        int curr =0;
        for(int h:heights){
            while(countArr[curr]==0)curr++;
            if(h != curr) res++;
            countArr[curr]--;
        }
        return res;
    }
}
