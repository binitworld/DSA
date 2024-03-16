#include <bits/stdc++.h>
using namespace std;

bool isPrime(int num){
    if (num <=1 ) return false;
    for(int i=2 ; i*i <= num;i++){
        if (num % i ==0) return false;
    }
    return true;
}


int main(){
    int n ;
    cout <<" :";
    cin>>n;

    int i =2;
    int sum = 0;

    while (i<= n ){
        if (isPrime(i)){
            sum = sum +i;
        }
        i=i+1;
    }
    cout<<"Sum of all Prime number are :"<<sum<<endl;

}