#include<stdio.h>
int main()
{
int a[100],i,j,n,k,temp;
printf("enter the number of element yo want to sort\n");
scanf("%d",&n);
printf("enter those elements\n");
for(i=0; i<n; i++)
{
scanf("%d",&a[i]);
}

for(i=0; i<n-1; i++)
{
k=i;
for(j=i+1; j<n; j++)
{
if(a[j]<a[k])
{
k=j;
}
}
temp=a[i];
a[i]=a[k];
a[k]=temp;
}

printf("after sorting the elements are\n");

for(i=0; i<n; i++)
{
printf(" %d \n",a[i]);
}
return 0;
}


