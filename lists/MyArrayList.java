import java.util.*;
public class MyArrayList
{
    public static void main(String[] args)
    {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(8);
        System.out.println(list1.size());
        
        System.out.println(list1.get(1));
        
        list1.set(0,1);
        System.out.println(list1.get(0));
        
        list1.remove(2);
        System.out.println(list1);
        
        if(list1.contains(8))
        System.out.println("Yes");
        else 
        System.out.println("No");
        
        List<String> list2 = new ArrayList<>();
        list2.add("Christiano");
        list2.add("Ronaldo");
        
        List<String> list3 = new ArrayList<>();
        list3.add("is");
        list3.add("the");
        list3.add("best");
        list3.add("footballer");
        
        list2.addAll(list3);
        System.out.println(list2);
        
        list2.removeAll(list3);
        System.out.println(list2);
        
        list2.clear();
        System.out.println(list2);
        
        String temp[] = new String[list3.size()];
        list3.toArray(temp);
       for(String e : temp)
       {
        System.out.println(e);
       }
        
    }
}
       