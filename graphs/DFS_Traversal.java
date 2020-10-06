package Graph;
import java.util.*;

class Graphs
{
	private static LinkedList<Integer> adj[];
	
	@SuppressWarnings("unchecked")
	public Graphs(int v)
	{
		adj = new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adj[i] = new LinkedList<Integer>();
		}
	}
	public void addEdge(int source, int destination)
	{
		adj[source].add(destination);
		adj[destination].add(source);
	}
	public void DFSUtil(int source, boolean visited[])
	{
		visited[source] = true;
		System.out.println("Visited : "+source);
		
		for(int neighbour: adj[source])
		{
			if(!visited[neighbour])
			{
				DFSUtil(neighbour, visited);
			}
		}
	}
	public void DFS(int source)
	{
		boolean visited[] = new boolean[adj.length];
	
		DFSUtil(source, visited);
	}
	public boolean DFSUtil(int source, int destination, boolean visited[])
	{
		if(source==destination)
		{
			return true;
		}
		for(int neighbour: adj[source])
		{
			if(!visited[neighbour])
			{
				visited[neighbour] = true;
				boolean isConnected = DFSUtil(neighbour, destination, visited);
				if(isConnected)
				{
					return true;
				}
			}
		}
		return false;
	}
	public boolean DFS(int source, int destination)
	{
		boolean visited[] = new boolean[adj.length];
		
		visited[source] = true;
		
		return DFSUtil(source, destination, visited);
	}
	public boolean DFSStack(int source, int destination)
	{
		boolean visited[] = new boolean[adj.length];
		
		visited[source] = true;
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(source);
		
		while(!s.isEmpty())
		{
			int current = s.peek();
			if(current==destination)
			{
				return true;
			}
			s.pop();
			
			for(int neighbour: adj[current])
			{
				if(visited[neighbour]==false)
				{
					visited[neighbour] = true;
					s.push(neighbour);
				}
			}
		}
		return false;
	}
}

public class DFS_Solution {

	public static void main(String[] args) {
		
		// This is DFS Solution for the Graph Data Structure. It is more memory efficient than BFS Solution. 
		// It just tells that there is a path between given source and destination.
		// It does not guarantee that it is the minimum path.
		
		Scanner sc = new Scanner(System.in);
		
		int v,e;
		System.out.print("Enter the number of vertices : ");
		v = sc.nextInt();
		System.out.print("Enter the number of edges : ");
		e = sc.nextInt();
		
		Graphs graph = new Graphs(v);
		
		System.out.println("Enter "+e+" edges :");
		
		for(int i=0;i<e;i++)
		{
			int source = sc.nextInt();
			int destination = sc.nextInt();
			graph.addEdge(source, destination);
		}
		int source, destination, choice;
		
		System.out.println("Enter 1 for whole traversal of the graph.");
		System.out.println("Enter 2 for traversing through source and destination of the graph using Recursion.");
		System.out.println("Enter 3 for traversing through source and destination of the graph using Stack.");
		choice = sc.nextInt();
		
		if(choice==1)
		{
			System.out.print("Enter the source for BFS Traversal : ");
			source = sc.nextInt();
			graph.DFS(source);
		}
		else if(choice==2)
		{
			System.out.print("Enter the source for DFS Traversal : ");
			source = sc.nextInt();
			System.out.print("Enter the destination for DFS Traversal : ");
			destination = sc.nextInt();

			System.out.println("Possible : "+graph.DFS(source, destination));
		}
		else
		{
			System.out.print("Enter the source for DFS Traversal : ");
			source = sc.nextInt();
			System.out.print("Enter the destination for DFS Traversal : ");
			destination = sc.nextInt();
			
			System.out.println("Possible : "+graph.DFSStack(source, destination));
		}
		sc.close();
	}
}
