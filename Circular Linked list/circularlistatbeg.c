#include<stdio.h>
#include<stdlib.h>
struct node{
int data;
struct node* next;
};
struct node* last;
void create(int);
void display();
int main()
{
last=NULL;
int m,n,i;
printf("enter the number nodes to be inserted\n");
scanf("%d",&m);
for(i=0; i<m; i++)
{
printf("enter the data\n");
scanf("%d",&n);
create(n);
}
display();
return 0;
}

void create(int n)
{
struct node* temp;
temp=(struct node*)malloc(sizeof(struct node));
temp->data=n;
if(last==NULL)
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
printf(" %d ",last->data);
}
}

