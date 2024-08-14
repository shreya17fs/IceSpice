#include<iostream>
using namespace std;

int main()
{
    int x[10],y[10],p[10],k,n,f,i,j=1,f1=1,f2=0;
    cout<<"Enter the number of observations: ";
    cin>>n;
    cout<<"\nEnter the different values of x: ";
    for(i=1;i<=n;i++)
    {
        cin>>x[i];
    }
    cout<<"Enter the corressponding values of y: ";
    for(i=1;i<=n;i++)
    {
        cin>>y[i];
    }
    f=y[1];
    cout<<"\nEnter the number of values of 'k' in f(k) you want to evaluate: ";
    cin>>k;
    do
    {
        for(i=1;i<=n-1;i++)
        {
            p[i]=((y[i+1]-y[i])/(x[i+j]-x[i]));
            y[i]=p[i];
            cout<<"The differences";
            cout<<y[i]<<endl;
        }
        for(i=1;i<=j;i++)
        {
            f1*=(k-x[i]);
        }       
        f2+=(y[1]*f1);
        f1=1;
        n--;
        j++;
    } while (n!=1);
    f+=f2;
    cout<<endl;
    cout<<"f("<<k<<")="<<f;
    return 0;
}
