#include<iostream>
#include<string.h>


using namespace std;
 
class str
{
    public:
    char a[20];
    void getdata(){
        cout<<"Enter your String : "<<endl;
        cin>>a;
    }
    void putdata(){
        cout<<"Your output string is : "<<a<<endl;
    }
    friend void operator + (str,str);
    //friend void operator = (str,str);
};   

void operator + (str a1, str a2){
    str c;
    strcpy(c.a,a1.a);
    strcat(c.a,a2.a);
    cout<<"Your concatenated string is "<<c.a<<endl;
}

/*void operator = (str a1){
    strcpy (this -> a, a1.a);
    cout<<"Your copied string is : "<<this -> a <<endl;
}*/

int main(){
    str a;
    a.getdata();
    a.putdata();
    str b;
    b.getdata();
    b.putdata();
    a+b;
    //a.getdata();
   // b.getdata();
    //a.putdata();
   // b.putdata();
   // a=b;
}