#include<stdio.h>
#include<stdlib.h>
#define max 15
int a[max];
int top=-1;
void push();
void pop();
void display();
int main()
{
int choice;
while(1)
{
printf("enter 1 for push\n");
printf("enter 2 for pop\n");
printf("enter 3 to display\n");
printf("enter 4 to exit\n");

printf("enter the operation which you want to exceute\n");
scanf("%d",&choice);
switch(choice)
{
case 1: 
push();
break;
case 2:
pop();
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
}

void push()
{
int item;
printf("enter the element to inserted");
scanf("%d",&item);
if(top==max-1)
{
printf("stack overflow");
return;
}
top=top+1;
a[top]=item;
}

void pop()
{
if(top==-1)
{
printf("stack underflow");
return;
}
printf("poped element is\n");
printf(" %d ",a[top]);
top=top-1;
}

void display()
{
int i;
if(top==-1)
{
printf("no element is present in the stack");
return;
}
for(i=top; i>=0; i++)
{

printf("element is \n");
printf(" %d ",a[i]);

}
}

