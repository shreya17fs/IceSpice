#include<stdio.h>
struct node
{
int info;
struct node *link;
};
void push(),pop(),disp();
struct node *top,*ptr,*cpt;
int opt,data;
char ch,ch1;
void main()
{
do
{
printf("(1) Push Operation of Stack using Linked List\n");
printf("(2) Pop Operation of Stack using Linked List\n");
printf("(3) Exit\n");
printf("Enter an option:- ");
scanf("%d",&opt);
switch(opt)
{
case 1:
       push();
       disp();
       break;
case 2:
       pop();
       break;
case 3: exit(0);
default:printf("\nWrong Option\n");
}
printf("\nDo you want to move on main menu (y/n):- ");
scanf(" %c",&ch);
}
while(ch=='y' || ch=='Y');
}
void push()
{
ptr=(struct node*)malloc(sizeof(struct node));
printf("Enter first node information:- ");
scanf("%d",&ptr->info);
top=ptr;
ptr->link=NULL;
do
{
cpt=(struct node*)malloc(sizeof(struct node));
printf("Enter next node information:- ");
scanf("%d",&cpt->info);
cpt->link=ptr;
ptr=cpt;
top=cpt;
printf("\nDo you want to add more nodes (y/n):- ");
scanf(" %c",&ch1);
}
while(ch1=='y' || ch1=='Y');
}
void disp()
{
printf("Stack is:- ");
ptr=top;
while(ptr!=NULL)
{
printf("%d->",ptr->info);
ptr=ptr->link;
}
}
void pop()
{
do
{
if(top==NULL)
{
printf("\nUnderflow\n");
exit(0);
}
else
{
ptr=top;
top=ptr->link;
free(ptr);
}
disp();
printf("\nDo you want to remove more nodes (y/n):- ");
scanf(" %c",&ch);
}
while(ch=='y' || ch=='Y');
}
