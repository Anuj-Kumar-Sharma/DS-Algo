#include<stdio.h>
#include<stdlib.h>
struct node{
int data;
struct node* next;
};
struct node* last;
void create(int);
void display();
void insertatbeg();
int main()
{
last=NULL;
int m,n,i;
printf("enter the number of node to be inserted");
scanf("%d",&m);
for(i=0; i<m; i++)
{
printf("enter the data");
scanf("%d",&n);
create(n);}
insertatbeg();
display();

return 0;
}

void create(int value)
{ 
struct node* temp;
temp=(struct node*)malloc(sizeof(struct node));
temp->data=value;
if((last==NULL))
{
last=temp;
last->next=temp;
}
else
{
temp->next=last;
last->next=temp;
last=temp;
}
}

void display()
{
struct node* p;
p=last->next;
while(p!=last)
{
printf(" %d ",p->data);
p=p->next;
}
printf(" %d ",last->data);
}

void insertatbeg()
{
struct node* p;
struct node* temp;
int val;
printf("enter the data to be inserted");
scanf("%d",&val);
temp=(struct node*)malloc(sizeof(struct node));
temp->data=val;
p=last->next;
temp->next=p;
last->next=temp;
p=temp;
}
