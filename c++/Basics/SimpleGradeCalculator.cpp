#include <bits/stdc++.h>
using namespace std;
int main(){
    int marks;
    cout<<"Enter your marks  : ";
    cin>>marks;

    if(marks <25){
        cout<<"You got 'F' grade";
    }else if(marks >= 25 && marks <=44){
        cout<<"You got 'E' grade";
    }else if(marks >= 45 && marks <=49){
        cout<<"You got 'D' grade";
    }
    else if(marks >= 50 && marks <=59){
        cout<<"You got 'C' grade";
    
    }else if(marks >= 60 && marks <=79){
        cout<<"You got 'B' grade";
    
    }else{
        cout<<"You got 'A' grade";
    }

    return 0;
}
