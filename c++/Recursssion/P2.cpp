// Print Name N times :)
#include <bits/stdc++.h>
using namespace std;
    void f(int i,int n){
        
        if (i>=n) return;
        cout<<" Binit " << endl;
        f(i+1,n);
    }
int main(){
    int n;
    cout<<"Enter the  Integer number to print The name upto : ";
    cin>>n;
    f(1,n);
    return 0;
}