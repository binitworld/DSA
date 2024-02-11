#include <bits/stdc++.h> //we can include all of the c++ libaries bit/stdc++.h
using namespace std;

int main(){
    // The ways to store the integer -- int  can we store by using these two methods  long  and long long;
    long m ;
    cout << "Enter  your value as integer  : " ;
    cin >> m;

    long long v;
    cout << "Enter  your long number   : " ;
    cin >> v;

    // To store float value type we use float-- 4 byte , double -- 8byte & long double --10byte;

    float b ;
    cout<<"enter the value upto 4 bytes only :";
    cin>> b;

    double j;
    cout<<"Enter the value upto 8 byte only :" ;
    cin>>j;

    long double ty;
    cout<<"Enter the value upto 10 byte only:" ;
    cin>>ty;












    int x ;
    cout << "Enter  your age  : " ;
    cin >> x;
    
    // To store the name and the text like sentence we ues String or getline(To store every thing in a string);
    
    string name;

    getline(cin , name);
    cout<<"Enter the name you want to store :"  ;
    

    
    //To store the single character we uses char;

    char val;
    cout<<"Enter the single key character word  : ";
    cin>>val;







    cout<<" your name is : " <<name <<"\n";
    cout<<"your age  is : " << x <<"\n";
    cout<<"your long is : " << m <<"\n";
    cout<<"your long long number is : " << v <<"\n";
    cout<<"your single key value is :"<<val<<"\n";
    cout<<"your 4 byte float value  is :"<<b<<"\n";
    cout<<"your 8 byte float value  is :"<<j<<"\n";
    cout<<"your 10 byte float value  is :"<<ty<<"\n";
    
    
    
    
    
    
    
    
    
    
    return 0;
}