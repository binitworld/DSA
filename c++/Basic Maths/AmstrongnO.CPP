#include<bits/stdc++.h>
using namespace std;

bool ArmstrongNum(int n){
    int sum = 0;
    int NumberDigit =0;
    int dup =n;
    while(dup!=0){
        dup/=10;
        NumberDigit++;

    }
    dup=n;
    while(n!=0){
        int Ldigit = n % 10;
        n /= 10;
        sum = sum + pow(Ldigit ,NumberDigit);
    }
    if (sum == dup){
        return true;
    }else{
        return false;
    }
}
int main(){
    int n;
    cin>> n;
    cout << boolalpha <<ArmstrongNum(n)<<endl;
    return 0;
}