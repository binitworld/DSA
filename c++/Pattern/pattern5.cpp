#include <bits/stdc++.h>
using namespace std;

void pattern5(int n){
    int i,j;
    for (i = 1; i<= n;i++){
        for(j=0;j<n-i+1;j++){
            cout<< "* ";
        }
        cout<<endl;
    }
}
int main(){
    int n ;
    cout<<"Enter the integer value till you want to print :";
    cin>> n;
    pattern5(n);
}