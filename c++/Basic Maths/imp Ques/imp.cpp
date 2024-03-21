// Problem statement:
// You are given a number ’n’.
// Find the number of digits of ‘n’ that evenly divide ‘n’.
// Note:
// A digit evenly divides ‘n’ if it leaves no remainder when dividing ‘n’.
// Example:
// Input: ‘n’ = 336

// Output: 3

#include<bits/stdc++.h>
using namespace std;
int countDigit(int n){
    int m = n;
    int count = 0;
    while(n!=0){
        int digit = n % 10;
        if(digit != 0 && m % digit == 0){
            count++;
        } 
            n/=10;
    }
    return count;
}
int main(){
    int n ;
    cout <<"Enter the value  for count : ";
    cin>>n;
    cout << countDigit(n)<< endl;
    return 0;
}

