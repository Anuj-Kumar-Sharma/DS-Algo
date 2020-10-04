#include<stdio.h>
#include<stdlib.h>
struct node{
int data;
struct node* next;
};
struct node* head;
struct node* last;
void insertatstart(int);
void display();
int main()
{
head=NULL;
last=NULL;
int m,n,i;
printf("enter the number of node to be inserted");
scanf("%d",&n);
for(i=0; i<n; i++)
{
printf("enter the value to be inserted");
scanf("%d",&m);
insertatstart(m);
display();
}
return 0;
}
void insertatstart(int value)
{
struct node* temp;
temp=(struct node*)malloc(sizeof(struct node));
temp->data=value;
temp->next=NULL;
temp->next=head;
head=temp;
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

