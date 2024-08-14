#include<iostream>
using namespace std;

class times{
    int hour,min;
    public:
    void get(int h, int m){
        hour = h;
        min = m;
    }
    void put(){
        cout<<hour<<"hours"<<min<<"minutes"<<"\n";
    }
    void sum(times,times);
};

void times :: sum(times t1, times t2){
    min = t1.min + t2.min;
    hour = min/60;
    min = min%60;
    hour = hour + t1.hour + t2.hour;
}

int main(){
    times t1,t2,t3;
    t1.get(5,40);
    t2.get(6,50);
    t3.sum(t1,t2);
    t1.put();
    t2.put();
    t3.put();
    return 0;
}