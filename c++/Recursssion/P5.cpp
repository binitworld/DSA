// Print Linearly from 1 to N but by Back-tracking
#include<bits/stdc++.h>
using namespace std;
void code(int i, int n ){
    if(i<1) return;
    code(i-1,n);
    cout<<i;

}int main(){
    int n;
    cout<<" : ";
    cin>>n;
    code(n,n);        // Taking the value as 5 send to void function  and it check as i< 1  which means 5  so it is not  which result to code (i-1,n) here (5 -1 ,5 ) such that till 0  and them that function  if (i<1) ocurred and such a result 12345 is resulted;   
    return 0;
}