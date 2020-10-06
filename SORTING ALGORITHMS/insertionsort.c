#include<stdio.h>
int main()
{
int a[100],i,j,temp,n;
printf("enter the number of element to be sorted\n");
scanf("%d",&n);
printf("enter those element\n");
for(i=0; i<n; i++)
{
scanf("%d",&a[i]);
}

for(i=1; i<n; i++)
{
temp=a[i];

for(j=i-1; j>=0; j-- && temp<a[j])
{
a[j+1]=a[j];
}
a[j+1]=temp;
}

printf("sorted elements are in order as follows\n");

for(i=0; i<n; i++)
{
printf(" %d ",a[i]);
}
return 0;
}


