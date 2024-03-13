// Print linearly from 1 to N
#include <bits/stdc++.h>
using namespace std;
void f(int i , int n){
    if (i>n) return;
    cout<< i <<endl;
    f(i+1, n);
}
int main(){
    int n;
    cout<<"Enter The value of N :";
    cin>>n;
    f(0,n);
    return 0;
}