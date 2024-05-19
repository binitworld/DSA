#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cout<< ": ";
    cin>>n;

    int i=1;
    int sum = 0;

    while (i<=n){
        if(i%2==0){
        sum=sum+i;
        }
        i=i+1;

    }
    cout << "Sum of all even number :"<< sum <<endl;
}