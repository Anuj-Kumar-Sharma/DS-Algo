#include<stdio.h>
#include<stdlib.h>
struct node{
int data;
struct node* next;
};
struct node* head;
struct node* last;
void create(int);
void display();
void search(int);
int main()
{
head=NULL;
last=NULL;
int m,n,i,tump;
printf("enter the number of node to be created");
scanf("%d",&n);
for(i=0; i<n; i++)
{
printf("enter the value to be inserted");
scanf("%d",&m);
create(m);
display();
}
printf("enter the number to be searched");
scanf("%d",&tump);
search(tump);
return 0;
}
void create(int value)
{
struct node* temp;
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
printf(" %d->",p->data);
p=p->next;
}
}
}
void search(int m)
{
struct node* p;
p=head;
while(p!=NULL)
{
if(p->data==m)
{
printf("element is found\n");
printf("element is %d ",p->data);
}
else
printf("element is not found");
p=p->next;
}
}
