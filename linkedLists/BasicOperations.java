package linkedLists;

import java.util.*;

public class BasicOperations {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the total length : ");
            int n = sc.nextInt();

            List numbers = new LinkedList();
            System.out.println("Enter the numbers : ");
            for (int i =0; i<n; i++) {
                numbers.add(sc.nextInt());
            }

            int quiery = sc.nextInt();
            System.out.println("Enter the String : ");
            for(int i =0; i<quiery; i++){
                String s = sc.next();
                if(s.equals("Insert")){
                    numbers.add(sc.nextInt(),sc.nextInt());
                }
                else if (s.equals("Delete")){
                    numbers.remove(sc.nextInt());
                }

            }

            for (Object item : numbers){
                System.out.print(item + " ");
            }



        }
}
