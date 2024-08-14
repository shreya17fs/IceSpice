
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int count = 0;
struct node {
    struct node* prev;
    int ssn;
    long int phno;
    float sal;
    char name[20], dept[10], desg[20];
    struct node* next;
} * h, *temp, *temp1, *temp2, *temp4;

void create()
{
    int ssn;
    long int phno;
    float sal;
    char name[20], dept[10], desg[20];
    temp = (struct node*)malloc(sizeof(struct node));
    temp->prev = NULL;
    temp->next = NULL;
    printf("\n enter ssn, name, depart"
           "ment, designation, salary "
           "and phno of employee:\n");
    scanf("%d %s %s %s %f %ld",
          &ssn, name, dept, desg,
          &sal, &phno);
    temp->ssn = ssn;
    strcpy(temp->name, name);
    strcpy(temp->dept, dept);
    strcpy(temp->desg, desg);
    temp->sal = sal;
    temp->phno = phno;
    count++;
}

void insertbeg()
{
    
    if (h == NULL) {
        create();
        h = temp;
        temp1 = h;
    }
  
    else {
        create();
        temp->next = h;
        h->prev = temp;
        h = temp;
    }
}
  

void insertend()
{
    
    if (h == NULL) {
        create();
        h = temp;
        temp1 = h;
    }
  
    
    else {
        create();
        temp1->next = temp;
        temp->prev = temp1;
        temp1 = temp;
    }
}
  

void displaybeg()
{
    temp2 = h;
    if (temp2 == NULL) {
        printf("\n list is empty\n");
        return;
    }
    printf("\n linked list elements "
           "from beginning:\n");
    while (temp2 != NULL) {
        printf("%d %s %s %s %f %ld\n",
               temp2->ssn, temp2->name,
               temp2->dept, temp2->desg,
               temp2->sal, temp2->phno);
        temp2 = temp2->next;
    }
  
    
    printf("number of employees=%d", count);
}
  

int deleteend()
{
    struct node* temp;
    temp = h;
    if (temp == NULL) {
        printf("list is empty\n");
        return 0;
    }
    if (temp->next == NULL) {
        printf("%d %s %s %s %f %ld\n",
               temp->ssn, temp->name,
               temp->dept, temp->desg,
               temp->sal, temp->phno);
        free(temp);
        h = NULL;
    }
    else {
        temp = temp1;
        temp2 = temp1->prev;
        temp2->next = NULL;
        printf("%d %s %s %s %f %ld\n",
               temp->ssn, temp->name,
               temp->dept, temp->desg,
               temp->sal, temp->phno);
        free(temp);
        temp1 = temp2;
    }
    count--;
    return 0;
}
  

int deletebeg()
{
    struct node* temp;
    temp = h;
    if (temp == NULL) {
        printf("list is empty\n");
        return 0;
    }
    if (temp->next == NULL) {
        printf("%d %s %s %s %f %ld\n",
               temp->ssn, temp->name,
               temp->dept, temp->desg,
               temp->sal, temp->phno);
        free(temp);
        h = NULL;
    }
    else {
        h = h->next;
        h->prev = NULL;
        printf("%d %s %s %s %f %ld\n",
               temp->ssn, temp->name,
               temp->dept, temp->desg,
               temp->sal, temp->phno);
        free(temp);
    }
    count--;
    return 0;
}
  

void employerDetails()
{
    int ch, n, i;
    h = NULL;
    temp = temp1 = NULL;
    printf("--------Menu------------\n");
    printf("\n 1.create a DLL of n emp");
    printf("\n 2.display from beginning");
    printf("\n 3.insert at end");
    printf("\n 4.delete at end");
    printf("\n 5.insert at beginning");
    printf("\n 6.delete at beginning");
    printf("\n 7.to show DLL as queue");
    printf("\n 8.exit\n");
    printf("----------------------\n");
    while (1) {
        printf("\n enter choice : ");
        scanf("%d", &ch);
  
        // Switch statements begins
        switch (ch) {
        case 1:
            printf("\n enter number of"
                   " employees:");
            scanf("%d", &n);
            for (i = 0; i < n; i++)
                insertend();
            break;
        case 2:
            displaybeg();
            break;
        case 3:
            insertend();
            break;
        case 4:
            deleteend();
            break;
        case 5:
            insertbeg();
            break;
        case 6:
            deletebeg();
            break;
        case 7:
            printf(
                "\n to show DLL as queue"
                " \n1.perform insert and"
                " deletion operation by "
                "calling insertbeg() and "
                "deleteend() respectively\n "
                "\t OR \n 2.perform insert "
                "and delete operations by "
                "calling  insertend() and "
                "deletebeg() respectively\n");
            break;
        case 8:
            exit(0);
        default:
            printf("wrong choice\n");
        }
    }
}
  

int main()
{
    
    employerDetails();
  
    return 0;
}