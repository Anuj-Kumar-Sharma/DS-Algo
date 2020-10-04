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
void deleteatpos(int);
int main()
{
head=NULL;
last=NULL;
int m,n,i,pos;
printf("enter the number of nodes to be created");
scanf("%d",&n);
for(i=0; i<n; i++)
{
printf("enter the value");
scanf("%d",&m);
create(m);
display();
}
printf("enter the position at which the node should be deleted");
scanf("%d",&pos);
deleteatpos(pos);
display();
return 0;
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

void deleteatpos(int position)
{
struct node* temp;
struct node* p;
p=head;
int i;
for(i=1; i<position-1; i++)
{
p=p->next;
}
temp=p->next;
p->next=temp->next;
free(temp);
}







