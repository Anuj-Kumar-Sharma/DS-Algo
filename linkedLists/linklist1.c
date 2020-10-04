#include<stdio.h>
#include<stdlib.h>
struct node
{
int info;
struct node *link;
};
struct node *start=NULL;
struct node *createnode();
void createlink();
int main()
{
createnode();
createlink();
return 0;
}
struct node *createnode()
{
struct node *n;
n=(struct node*)malloc(sizeof(struct node));
return (n);
}
void createlink()
{
struct node *temp;
int i,n;
temp=createnode();
start=temp;
printf("enter the number of node to be created");
scanf("%d",&n);
printf("enter the info part");
scanf("%d",&temp->info);
temp->link=NULL;
printf(" %d ",temp->info);
for(i=1; i<=n; i++)
{
if(i<n)
{
temp=temp->link;
printf("enter the info part");
scanf("%d",&temp->info);
printf(" %d ",temp->info);
}
else
temp->link=NULL;
}
}


