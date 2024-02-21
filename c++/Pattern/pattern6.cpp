#include <bits/stdc++.h>
using namespace std;

void pattern6(int n){
    int i , j;
    for (i = 1;  i<= n; i++){
        for(j=1; j<=n-i+1;j++){
            cout<<j<<" ";
        }
        cout<<endl;
    }   //  end for 
}int main(){
    int n;
    cout<<"Enter the integer Until you want to print the patterns : ";
    cin>> n;
    pattern6(n);
}