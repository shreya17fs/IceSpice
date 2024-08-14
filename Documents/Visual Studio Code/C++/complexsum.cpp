#include<iostream>
using namespace std;

class complex{
    float x,y;
    public:
    void get(float real,float imag){
        x=real;
        y=imag;
    }
    void show(complex);
    friend complex sum(complex,complex);
}; 

complex sum(complex c1, complex c2){
    complex c3;
    c3.x = c1.x + c2.x;
    c3.y = c1.y + c2.y;
    return(c3);
}

void complex :: show(complex c){
    cout<<c.x<<"+"<<c.y<<"i"<<"\n";
}

int main(){
    complex A,B,C;
    A.get(3.1,5.6);
    B.get(2.7,1.2);
    C = sum(A,B);
    A.show(A);
    B.show(B);
    C.show(C);
}