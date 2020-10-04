#include<stdio.h>
struct node{
int info;
struct node* link;
};
struct node* head;
int main()
{
int x,n,i;
printf("enter how many nodes you want to create");
scanf("%d",&n);
head=NULL;
for(i=0; i<n; i++)
{
struct node* temp;
temp=(struct node*)malloc(sizeof(struct node));
printf("enter the info part");
scanf("%d",&x);
temp->info=x;
temp->link=NULL;
head=temp;
printf(" %d-> ",temp->info);
}
return 0;
}

