#include<bits/stdc++.h>
using namespace std;

void pattern2(int n){
    int i,j;
    for ( i = 0; i < n; i++)
    {
        for (j=0; j<= i ; j++){
            cout<<"$";
        }
        cout<<endl;
    }
}
int main(){
    int n ;
    cout<<"Enter no. of rows Till you want to see the patterns :";
    cin>>n;
    pattern2(n);
}