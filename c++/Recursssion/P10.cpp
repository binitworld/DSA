// Multiplication

#include<bits/stdc++.h>
using namespace std;
void mul(int i, int multi){
    if(i<1){
        cout<< multi<< endl;
        return;
    }
    mul(i-1, multi*i);
}int main(){
    int n;
    cout<< "n = ";
    cin>>n;
    mul(n,1);
    return 0;

}