#include <iostream>
#include <math.h>
using namespace std;
float func(float x)
{   
     return  pow(x,2)+(3*x)+1 ;
}
float derivative(float x)
{   
     return  2*x + 3 ;
}
int main()
{   float a,e=0;
    double z;
    cout<<"Enter Number ";
    cin>>a;
    do
    {   e++;
        z=a-(func(a)/derivative(a));
        cout<<"The iterative "<<e<<" root is "<<z;    
        a=z;
        cout<<endl;
    }while(abs(func(z))>0.001);
    return 0;
}
