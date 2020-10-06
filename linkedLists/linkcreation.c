#include<stdio.h>
#include<stdlib.h>
struct node
{
int info;
struct node *link;
};
int main()
{
struct node *p,*start,*temp;
int element;
/*
printf("enter the total number of node");
scanf("%d",&n);
printf("enter the element part");
scanf("%d",element);
*/
temp=(struct node*)malloc(sizeof(struct node));
printf("enter the element part");
scanf("%d",element);
temp->info=element;
temp->link=NULL;
p=temp;
printf("node is %d",temp->info);
return 0;
}
