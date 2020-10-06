#include<stdio.h>
#include<stdlib.h>
struct node{
int data;
struct node* next;
};
struct node* last;
void create(int);
void display();
void insertatnpos();
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
insertatnpos();
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


void insertatnpos()
{
int value,position,i;
printf("enter the position at which we have to insert the node");
scanf("%d",&position);
printf("enter the data to be inserted");
scanf("%d",&value);
struct node* temp;
struct node* p;
temp=(struct node*)malloc(sizeof(struct node));
temp->data=value;
p=last->next;
for(i=1; i<position-1; i++)
{
p=p->next;
}
if(p==last)
{
temp->next=p->next;
p->next=temp;
}
if(p==last)
{
temp->next=p->next;
p->next=temp;
p=temp;
}
}


