#include <iostream>
using namespace std;

class Employee
{
    int num;
    static int count;

public:
    void setData(int a)
    {
        num = a;
        count++;
    }
    void getData()
    {
        cout<< count << endl;
    }
};

// Count is the static data member of class Employee
int Employee::count; // Default value is 0

int main()
{
    Employee a,b,c;
    a.getData();
    b.getData();
    c.getData();
    cout<<endl;

    a.setData(100);
    a.getData();
    b.setData(200);
    b.getData();
    c.setData(300);
    c.getData();

    cout<<endl;
    a.getData();
    b.getData();
    c.getData();

    
    return 0;
}