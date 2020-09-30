import java.util.*;
import java.io.*;


class Node
{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
}

class LinkedList
{  
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t--> 0)
        {
            int n = sc.nextInt();

            int key = sc.nextInt();
            Node head= new Node(key);
            Node tail= head;

            for(int i=0;i<n-1;i++)
            {
                key = sc.nextInt();
                tail.next = new Node(key);
                tail = tail.next;
            } 

	//for testing,we can create a loop by inserting the next line
		//head.next= head 
          //loops can be created in several ways

            if(detectLoop(head))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
    public static boolean detectLoop(Node head)
    {
        Node fast=head;
        Node slow=head;

       while (slow!= null && fast!= null && fast.next!=null) 
        { 
            slow=slow.next; 
            fast=fast.next.next; 
            if(slow==fast)  
            { 	// there exists a loop if and only if both fast and slow pointer point to a same one during traversal
                return true;
            } 
        } 

        return false;
    }
}



