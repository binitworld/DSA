#include<bits/stdc++.h>
using namespace std;
void pattern10(int n){
    int i,j;
    for( i = 1; i<=2*n-1;i++) {
        int stars = i;
        if(i>n) stars = 2*n - i;
        for(int j = 1;j<=stars;j++) {
        cout << "* ";
        }
        cout << endl;
    }
        
}
int main(){
    int n;
    cout<<"Enter the integer upto which you want to print the pattern : ";
    cin>>n;
    pattern10(n);
}