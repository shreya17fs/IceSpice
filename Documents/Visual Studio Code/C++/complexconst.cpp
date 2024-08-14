#include<iostream>
using namespace std;

class complex{
    float x,y;
    public:
    complex(){

    }
    complex(float a){
        x=y=a;
    }
    complex(float real,float imag){
        x=real;
        y=imag;
    }
    friend complex sum(complex,complex);

    void show(){
    cout<<x<<"+"<<y<<"i"<<"\n";
    } 
}; 

complex sum(complex c1, complex c2){
    complex c3;
    c3.x = c1.x + c2.x;
    c3.y = c1.y + c2.y;
    return(c3);
}

int main(){
    complex A(3.1,5.6);
    complex B(2.7,1.2);
    complex C = sum(A,B);
    A.show();
    B.show();
    C.show();
}