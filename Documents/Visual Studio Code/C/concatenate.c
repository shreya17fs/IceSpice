#include<stdio.h>
int main() {
int a[50],b[50],c[100],ch,n1,n2,i,j,k=0;
printf("Enter no. of elements for first array (max 50):-\n"); scanf("%d",&n1);
printf("Enter first array:-\n"); for(i=0;i<n1;i++)
scanf("%d",&a[i]);
printf("Enter no. of elements for second array (max 50):-\n"); scanf("%d",&n2);
printf("Enter second array:-\n"); for(j=0;j<n2;j++)
scanf("%d",&b[j]); printf("(1)Concatenation\n");
    
printf("(2)Merging\n"); printf("Choose any option:-\n"); scanf("%d",&ch);
switch(ch) {
case 1: for(i=0;i<n1;i++) {
c[k]=a[i];
k++; }
for(j=0;j<n2;j++) {
c[k]=b[j];
k++; }
printf("The Resultant array is:-\n"); for(i=0;i<k;i++)
printf("%d ",c[i]); break;
case 2: i=0; j=0;
while(i<n1 && j<n2) {
if(a[i]<b[j]) {
c[k]=a[i]; i++;
k++;

} else {
c[k]=b[j]; j++;
k++;
} }
while(i<n1) {
c[k]=a[i]; i++;
k++;
}
while(j<n2) {
c[k]=b[j]; j++;
k++;
}
printf("The Resultant array is:-\n"); for(i=0;i<k;i++)
printf("%d ",c[i]); break;
default:printf("Wrong Option"); }
return 0;
}