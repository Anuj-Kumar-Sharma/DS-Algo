#include<stdio.h>
#include<stdlib.h>
struct node{
int data;
struct node* next;
};
struct node* head;
struct node* last;
void insertatpos(int,int);
void display();
void create(int);
int main()
{
head=NULL;
last=NULL;
int m,n,i,pos;
printf("enter the number of node to be inserted");
scanf("%d",&n);
for(i=0; i<n; i++)
{
printf("enter the value to be insertted");
scanf("%d",&m);
create(m);
display();
}
printf("enter the value and position at which  to be inserted");
scanf("%d%d",&m,&pos);
insertatpos(m,pos);
display();
return 0;
}
void insertatpos(int value,int position)
{
struct node* temp;
temp=(struct node*)malloc(sizeof(struct node));
temp->data=value;
temp->next=NULL;
struct node* p;
p=head;
int i;
for(i=1; i<position-1; i++)
p=p->next;
temp->next=p->next;
p->next=temp;
}
void display()
{
struct node* p;
p=head;
if(head==NULL)
printf("list is empty");
else
{
while(p!=NULL)
{
printf(" %d ",p->data);
p=p->next;
}
}
}
void create(int value)
{
struct node* temp;
temp=(struct node*)malloc(sizeof(struct node));
temp->data=value;
temp->next=NULL;
if(head==NULL)
{
head=temp;
last=temp;
}
else
{
last->next=temp;
last=temp;
}
}
