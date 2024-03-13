#include<bits/stdc++.h>
using namespace std;
void fun(int i , int n){
    if (i>n) return;
    fun(i+1,n);
    cout<<i;

}
int main(){
    int n;
    cout<< "Enter the number Till you want to print: ";
    cin>>n;
    fun(1,n);
    return 0;
}