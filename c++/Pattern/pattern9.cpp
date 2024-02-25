#include <bits/stdc++.h>
using namespace std;
void pattern7(int n){
    int i,j;
    for ( i=0;i<n;i++)
    {
        for( j=0;j<n-i-1;j++){
            cout<<" ";
        }
        for(j=0;j<2*i+1;j++){
            cout<<"*";
        }
        for(j=0;j<n-i+1;j++){
            cout<<" ";        
        }
        cout<<endl;
    }
}
void pattern8(int n){
    int i,j;
    for(i=0;i<n;i++){
        for (j=0;j<i;j++){
            cout<<" ";
        }
        for (j=0;j<2*n-(2*i+1);j++){
            cout<<"*";
        }
        for (j=0;j<i;j++){
            cout<<" ";
        }
        cout<<endl;
    }
}
int main(){
    int n;
    cout<<"Enter the no. You want the pattern of the triangle : ";
    cin>>n;
    pattern7(n);
    pattern8(n);
}
