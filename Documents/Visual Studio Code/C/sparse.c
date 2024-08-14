#include<stdio.h>
struct spar
{
int row,col,val;
}s[100];
int a[10][10],i,j,p=0,m,n;
int main()
{
printf("Enter the order of matrix:-\n");
scanf("%d%d",&m,&n);
printf("Enter the matrix in above order:-\n");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
scanf("%d",&a[i][j]);
printf("Entered matrix is:-\n");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
printf("%d ",a[i][j]);
}
printf("\n");
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
if(a[i][j]!=0)
{
s[p].row=i;
s[p].col=j;
s[p].val=a[i][j];
p++;
}
}
printf("\n");
}
printf("Sparse matrix is:-\n");
printf("Row\tColumn\tValue\n");
for(i=0;i<p;i++)
printf("%d\t%d\t%d\n",s[i].row,s[i].col,s[i].val);
return 0;
}
