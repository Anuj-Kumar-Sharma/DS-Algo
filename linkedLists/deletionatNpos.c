#include<stdio.h>
#include<stdlib.h>
struct node{
int data;
struct node* next;
};
struct node* head;
void insert(int,int);
void delete(int);
void print();
int main()
{
struct node* head;
head=NULL;
insert(5,1);                        //*inserting the data and position
insert(19,2);
insert(2,3);
insert(4,4);
insert(34,5);
print();
delete(3);
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
void delete(int position)
{
struct node* temp1;
temp1=(struct node*)malloc(sizeof(struct node));
if(position==1)
{
head=temp1->next;
free(temp1);
return;
}
for position;
for(position=0; i<position-2; i++)
{
temp1=temp1->next;
}
struct node* temp2;
temp2=temp1->next;
temp1->next=temp2->next;
free(temp2);
}

















