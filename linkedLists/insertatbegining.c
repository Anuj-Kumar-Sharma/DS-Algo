#include<stdio.h>
struct node{
int info;
struct node* link;
};
struct node* head;
void insert(int);
void print();
int main()
{
head=NULL;
int i,n,x;
printf("enter the number of node to be inserted");
scanf("%d",&n);
for(i=0; i<n; i++)
{
printf("enter the element");
scanf("%d",&x);
insert(x);
print();
}
return 0;
}
void insert(int x)
{
struct node* temp;
temp=(struct node*)malloc(sizeof(struct node));
temp->info=x;
temp->link=head;
head=temp;
}
void print()
{
struct node* temp;
temp=head;
printf("the node is: ");
while(temp!=NULL)
{
printf(" %d ",temp->info);
temp=temp->link;
}
printf("\n");
}

