#include<bits/stdc++.h>
using namespace std;

void divisor(int n){
    for(int i = 1; i <= n; i++){
        if(n % i == 0){
            cout << i <<endl;
        }
    }
    // cout << endl;
}
int main(){
    int n;
    cin>>n;
    divisor(n);
    return 0;
}