#include<stdio.h>
#include<stdlib.h>
struct node{
int data;
struct node* next;
};
struct node* front;
struct node* rear;
void insert();
void delete();
void display();
int main()
{
front=NULL;
rear=NULL;
int choice;
while(1)
{
printf("enter 1 to insert\n");
printf("enter 2 to delete\n");
printf("enter 3 to display\n");
printf("enter 4 to exit\n");
printf("enter the choice\n");
scanf("%d",&choice);
switch(choice)
{
case 1:
insert();
break;
case 2:
delete();
break;
case 3:
display();
break;
case 4:
exit(0);
break;
default:
printf("enterd choice is wrong");
}
}
return 0;
}

void insert()
{
int item;
printf("enter the element");
scanf("%d",&item);
struct node* temp;
temp=(struct node*)malloc(sizeof(struct node));
temp->data=item;
temp->next=NULL;
if(front==NULL)
{
front=temp;
rear=temp;
}
else
{
rear->next=temp;
rear=temp;
}
}

void delete()
{
struct node* p;
if(front==NULL)
{
printf("queue underflow");
return;
}
p=front;
front=front->next;
printf("deleted element is \n");
printf(" %d ",p->data);
free(p);
}

void display()
{
struct node* p;
p=front;
while(p!=NULL)
{
printf(" %d ",p->data);
p=p->next;
}
}

