public class Solution {
    class pairs
    {
        int a;
        int b;
        public pairs(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
    }
    public int coverPoints(int[] A, int[] B) {
       ArrayList<pairs> pair=new ArrayList<>();
       int count=0;
       for(int i=0;i<A.length;i++)
       {
           pairs onePair=new pairs(A[i],B[i]);
           pair.add(onePair);
       }
       for(int i=0;i<pair.size()-1;i++)
       {
           count=count+Math.max(Math.max((pair.get(i+1).a-pair.get(i).a),(pair.get(i+1).b-pair.get(i).b)),Math.max((pair.get(i).a-pair.get(i+1).a),(pair.get(i).b-pair.get(i+1).b)));
       }
       return count;
    }
}

