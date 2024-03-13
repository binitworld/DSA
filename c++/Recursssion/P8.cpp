// Sum of n terms in prioteriesed way 

#include<bits/stdc++.h>
using namespace std;

void add(int i, int sum){
    if (i < 0){
        cout<<"sum of n terms : "<< sum << endl;
        return;
    }
    add(i-1,sum+i);
}int main(){
    int n;
    cout<< "n :" ;
    cin>>n;
    add(n,0);
}