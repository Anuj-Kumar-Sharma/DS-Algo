#include<iostream>
#include <algorithm> 
using namespace std;
class Edge{
	public:
		int source;
		int destination;
		int weight;
};
bool compare(Edge e1,Edge e2)
{
	return e1.weight<e2.weight;
}
int findparent(int v, int *parent)
{
	if(parent[v]!=v)
	{
		return v;
	}
	return findparent(parent[v],parent);
}
void kruskals_algo(Edge *input,int n,int e)
{
	//sort according to weight
	sort(input,input+e,compare);
	
	Edge *output=new Edge[n-1];
	int *parent=new int[n];
	for(int i=0;i<n;i++)
	{
		parent[i]=i;
	}
	int count=0;
	int i=0;
	while(count!=n-1)
	{
		Edge currentVertex=input[i];
		int sourceparent=findparent(currentVertex.source,parent);
		int destparent=findparent(currentVertex.destination,parent);
		
		if(sourceparent!=destparent)
		{
			output[count]=currentVertex;
			count++;
			parent[sourceparent]=destparent;
		}
		i++;
		
	}
	
	for(int i=0;i<n-1;i++)
	{
		if(output[i].source<output[i].destination)
		{
			cout<<output[i].source<<" " <<output[i].destination<<" "<<output[i].weight<<endl;
		}
		else
		{
			cout<<output[i].destination<<" " <<output[i].source<<" "<<output[i].weight<<endl;
		}
	}
}
int main()
{
	int n,e;
	cin>>n>>e;
	Edge *input=new Edge[e];
	
	for(int i=0;i<e;i++)
	{
		int s,d,w;
		cin>>s>>d>>w;
		input[i].source=s;
		input[i].destination=d;
		input[i].weight=w;
	}
	kruskals_algo(input, n,e);
}
