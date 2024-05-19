#include <bits/stdc++.h>
using namespace std;

int main(){
    int a;
    cout<<"Enter the number : ";
    cin>>a;

    if(a>0){
        cout<<"The GIVEN NO IS Positive (+) " <<endl;

    }else if(a==0){
        cout<<"The number is neutral "<<endl ;
    }else{
        cout<<"The GIVEN NO IS Negative (-) "<<endl;
    }

    return 0;
}