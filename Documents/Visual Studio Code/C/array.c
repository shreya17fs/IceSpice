#include<stdio.h>
#define max 50
int stack[max],opt,i,data,top=-1;
void disp();
char ch1,ch2;
void main()
{
do
{
printf("(1)Push operation in stack\n");
printf("(2)Pop operation in stack\n");
printf("(3)Exit\n");
printf("Enter any option:-\n");
scanf("%d",&opt);
switch(opt)
{
case 1: 
	do
	{
	if(top==max-1)
	{
	printf("Overflow\n");
	exit(0);
	}
	else
	{
	printf("\nEnter an element\n");
	scanf("%d",&data);
	top=top+1;
	stack[top]=data;
	}
	disp();
	printf("\nDo you want to add more elements (y/n)\n");
	scanf(" %c",&ch1);
	}
	while(ch1=='y' || ch1=='Y');
	break;
case 2:	
	do
	{
	if(top<0)
	{
	printf("Underflow");
	exit(0);
	}
	else
	{
	stack[top]=NULL;
	top=top-1;
	}
	disp();
	printf("\nDo you want to pop more elements (y/n)\n");
	scanf(" %c",&ch1);
	}
	while(ch1=='y' || ch1=='Y');
	disp();
	break;
case 3: exit(0);
default: printf("Wrong choice");
}
printf("\nDo you want to continue for menu (y/n):-\n");
scanf(" %c",&ch2);
}
while(ch2=='y' || ch2=='Y');
}
void disp()
{
for(i=top;i>=0;i--)
printf("%d ",stack[i]);
}

