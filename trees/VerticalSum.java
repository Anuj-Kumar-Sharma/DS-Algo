import java.util.* ;

public class VerticalSum {
	
	static Scanner sc = null ;

	public static void main(String[] args) {
		
		sc = new Scanner (System.in);
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.left.left = new Node(7);
		root.right.left.right = new Node(8);
		
		System.out.println(verticalSum(root)) ;

	}
	
	
    public static ArrayList <Integer> verticalSum(Node root) {
        
        ArrayList <Integer> ans = new ArrayList<>() ;
        
        if(root == null) return ans;
        
        TreeMap <Integer , Integer> a = new TreeMap <>();
        verticalh(root , 0 , a);
        
        ans = new ArrayList<>(a.values()) ;
        return ans ;
    }
    
    public static void verticalh(Node root , int h , TreeMap<Integer , Integer> a) {
        if(root == null) return ;
        
        verticalh(root.left , h-1 , a) ;
        
        int prevSum = ( a.get(h) == null ) ? 0 : a.get(h) ;
        
        a.put(h , prevSum + root.data);
        
        verticalh(root.right , h+1 , a) ;
    }

}

class Node {
	Node left , right ;
	int data ;
	
	public Node(int data) {
		this.data = data ;
	}
}
