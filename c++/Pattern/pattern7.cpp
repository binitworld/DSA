#include <bits/stdc++.h>
using namespace std;
void  pattern7(int n){
    int i,j;
    for(i =0 ; i<n; i++){
        for (j=0 ; j<n-i-1; j++){
            cout<<" ";
        }
        for(j=0 ; j<2*i+1;j++){
            cout<<"*";
        } 
        for (j=0 ; j<n-i-1; j++){
            cout<<" ";
        }
        cout<<endl;
        

    }

}
int main(){
    int n;
    cout<<"Enter the the size of pyramid until you want to print  : ";
    cin>>n;
    pattern7(n);
}