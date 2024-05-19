#include <bits/stdc++.h>
using namespace std;

bool isNonPrime(int num){

    if ( num <=1) return true;
    for (int i=2; i*i <= num ; i++){
        if(num % i == 0) return true ;
    }
    return false;
}
int main(){
    int n;
    cout<<" : ";
    cin>>n;

    int i = 0;
    int sum =0;

    while(i <= n){
        if(isNonPrime(i)){
            sum =sum+i;

        }
        i =i+1;
    }
    cout << "Sum of all non Prime number  is : "<<sum<<endl;
}