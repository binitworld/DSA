#include <bits/stdc++.h>
using namespace std;

int main(){
    int x;
    int y;
    cout<<"Enter the First number :";
    cin>>x;
    cout<<"Enter the Second  number :";
    cin>>y;
    while(x>0&&y>0){
        if(x>y){
            x%=y;
        }else{
            y%=x;
        }
    }
    if(x==0){
        cout<<"GDC/hcf OF TWO NUMBER IS : " << y<<endl;
    }else{
        cout<<"GDC/hcf OF TWO NUMBER IS : " << x<< endl;
    }
}