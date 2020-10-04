#include<stdio.h>
#include<stdlib.h>
struct node{
int data;
struct node* next;
};
struct node* head;
void insert(int,int);
void print();
int main()
{
struct node* head;
head=NULL;
int i;
int n;
int data,position;
printf("enter the number of nodes to be inserted\n");
scanf("%d",&n);
for(i=0; i<n; i++)
{
printf("enter the data and the position where the element is to be inserted");
scanf("%d%d",&data,&position);
struct node* temp1;
temp1=(struct node*)malloc(sizeof(struct node));
temp1->data=data;
temp1->next=NULL;
insert(data,position);
print();
}
}
void insert(int data,int position)
{
int i;
struct node* temp1;
temp1=(struct node*)malloc(sizeof(struct node));
temp1->data=data;
temp1->next=NULL;
if(position==1)
{
temp1->next=head;
head=temp1;
return;
}
struct node* temp2;
temp2=head;
for(i=0; i<position-2; i++)
{
temp2=temp2->next;
}
temp1->next=temp2->next;
temp2->next=temp1;
}
void print()
{
struct node* temp;
temp=head;
while(temp!=NULL)
{
printf(" %d ",temp->data);
temp=temp->next;
}
printf("\n");
}
