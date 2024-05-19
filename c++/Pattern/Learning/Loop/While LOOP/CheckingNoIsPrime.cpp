#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cout << " : ";
    cin >> n;

    if(n<=1)return false;
    for(int i=2;i* i<=n ; i++){
        if (n%i == 0) return false ;
    }
    cout<< "YES nUMBER IS PRIME "<<endl ;

}