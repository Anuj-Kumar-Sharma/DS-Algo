#include<stdio.h>
int main()
{
int a[100],i,n,j;
printf("enter the number of element we want to sort\n");
scanf("%d",&n);
printf("enter those values\n");
for(i=0; i<n; i++)
{
scanf("%d",&a[i]);
}

for(i=0; i<n-1; i++)
{
for(j=0; j<n-1-i; j++)
{
if(a[j]>a[j+1])
{
int temp;
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
printf("after sorting \n");
for(i=0; i<n; i++)
{
printf(" %d ",a[i]);
}
return 0;
}
