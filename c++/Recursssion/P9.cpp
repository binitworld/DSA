#include <bits/stdc++.h>
using namespace std;
void sub(int i, int minus){
    if(i<1){
        cout<< minus<< endl;
        return;
    }
    sub(i-1, minus-i);
}int main(){
    int n;
    cout<< "n :";
    cin>>n;
    sub(n,0);
}
// Priteriosed way to subtracted in recursive order