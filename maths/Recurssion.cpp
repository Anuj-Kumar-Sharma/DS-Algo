#define MAX 50
int dp[MAX][MAX][MAX][MAX][4];

int permutationpos(int x,int y,int z,int w,int last)
{
    if(x<0||y<0||z<0||w<0)
        return 0;

    if(x==1 && y==0 && z==0 && w==0 && last==0)
        return 1;
    if(x==0&&y==1&&z==0&&w==0&&last==1)
        return 1;
    if(x==0&&y==0&&z==1&&w==0&&last==2)
        return 1;
    if(x==0&&y==0&&z==0&&w==1&&last==3)
        return 1;
    if(dp[x][y][z][w][last]!=-1)
        return dp[x][y][z][w][last];
    if(last==0)
       dp[x][y][z][w][last]=permutationpos(x-1,y,z,w,1)+permutationpos(x-1,y,z,w,2)+permutationpos(x-1,y,z,w,3);
    else if(last==1)
       dp[x][y][z][w][last]=permutationpos(x,y-1,z,w,0)+permutationpos(x,y-1,z,w,2)+permutationpos(x,y-1,z,w,3);
    else if(last==2)
       dp[x][y][z][w][last]=permutationpos(x,y,z-1,w,1)+permutationpos(x,y,z-1,w,0)+permutationpos(x,y,z-1,w,3);
    else
       dp[x][y][z][w][last]=permutationpos(x,y,z,w-1,1)+permutationpos(x,y,z,w-1,2)+permutationpos(x,y,z,w-1,0);

    return dp[x][y][z][w][last];
}

void solve()
{
	int x,y,z,w;
	cin>>x>>y>>w>>z;
	int rearrange;
	mem1(dp);
	rearrange = permutationpos(x,y,z,w,0)+
                permutationpos(x,y,z,w,1)+
                permutationpos(x,y,z,w,2)+
                permutationpos(x,y,z,w,3);
	cout<<rearrange<<"\n";
}
