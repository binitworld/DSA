#include<bits/stdc++.h>
using namespace std;

int main (){
    int a;
    int b;
    int m;
    int n;
    int o;

    cout <<"Enter The first number for the operation :";
    cin>>a;
    cout << "Enter The number first from it would be shift by :";
    cin>> b;
    cout << "Enter The second number from it would be shift by :";
    cin>> m;
    cout << "Enter The second  number for the operation :";
    cin>> n;    
    cout << "Enter The Third number for the operation : ";
    cin>> o;

    int c= a>>b;
    int d= a>>m;
    int e= n<<b;
    int f= o<<m;

    cout<<"case 1 :"<<c<<endl;
    cout<<"case 3 :"<<d<<endl;
    cout<<"case 3 :"<<e<<endl;
    cout<<"case 4 :"<<f<<endl;
    
}