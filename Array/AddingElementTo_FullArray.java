package Array;

import java.util.Scanner;

public class AddingElementTo_FullArray {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of INTEGER elements to be added = ");
        int n = sc.nextInt();
        int [] arrayOne = new int[n];
        int [] arrayTwo = new int [n+1];

        for(int i=0; i<arrayOne.length; i++){
            arrayOne[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be added at the last = ");
        int addedNumber = sc.nextInt();

        for (int i=0; i<arrayTwo.length-1; i++){
            arrayTwo[i] = arrayOne[i];
        }

        arrayTwo[arrayTwo.length-1] = addedNumber;

        System.out.println("ORIGINAL ARRAY : ");
        for (int i=0; i<arrayOne.length; i++){
            System.out.println(arrayOne[i]);
        }

        System.out.println("NEW ARRAY : ");
        for (int i=0; i<arrayTwo.length; i++){
            System.out.println(arrayTwo[i]);
        }

    }
}
