#include<iostream>
using namespace std;

	   class matrix
	   {
		  int a[10][10], m,n;
		 public:
		 matrix()
		 {
		 }
		 matrix(int m,int n)
		 {
			this->m=m;
			this->n=n;


		 }
		 void set_mat()
		 {
		 for(int i=0;i<m;i++)
		  for(int j=0;j<n;j++)
		  a[i][j]=0;
		  }

		 void read_mat();
		 void disp_mat();
		 void mul_mat(matrix,matrix);
	  };
	  void matrix :: read_mat()
	  {
		for(int i=0;i<m;i++)
		 for(int j=0;j<n;j++)
		 {
		   cout<<"Enter element ( " <<i+1<<","<<j+1<<" )"<<endl;
		   cin>>a[i][j];
		 }
	  }
	  void matrix :: disp_mat()
	  {
		cout<<"Matrix Elements:"<<endl;
		for(int i=0;i<m;i++)
		{
		 for(int j=0;j<n;j++)
			cout<<a[i][j]<<"  ";
		  cout<<endl;
		 }

	   }
	   void matrix :: mul_mat(matrix m1,matrix m2)
	   {
		  if(m1.n!=m2.m)
		  cout<<"Matrix multiplication is not possible "<<endl;
		  else
		  {
		  for(int i=0;i<m1.m;i++)
		   for(int j=0;j<m1.n;j++)
			for(int k=0;k<m2.n;k++)
			{
			  a[i][j]+=m1.a[i][k]*m2.a[k][j];
			}
		  }
		}
		int main()
		{
		  int m,n,p,q;
		  cout<<"Enter first matrix size "<<endl;
		  cin>>m>>n;
		  matrix m1(m,n);
		  m1.read_mat();
		  cout<<"Enter second matrix size "<<endl;
		  cin>>p>>q;
		  matrix m2(p,q);
		  m2.read_mat();
		  matrix m3(m,q);
		  m3.set_mat();
		  m3.mul_mat(m1,m2);
		  m1.disp_mat();
		  m2.disp_mat();
		  m3.disp_mat();
          return 0;
		  }