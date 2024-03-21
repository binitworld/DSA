/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
*/ 
#include<bits/stdc++.h>
using namespace std;
int ReverseOfNum(int  n){
    int rev =0;
    while(n!=0){
        int Ldigit = n % 10;
        n/=10;
        rev=(rev*10)+Ldigit; 
    }
    return rev;
}
int main(){
    int n;
    cin>>n;
    cout<<ReverseOfNum(n)<<endl;
    return 0;
}