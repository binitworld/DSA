#include <bits/stdc++.h>

using namespace  std;
void pattern4(int n){
    int i , j;
    for (i=1; i<= n;i++){
        for (j= 1; j<= i; j++){
            cout<< i << " ";
        }

        cout<<endl;
    }

}int main(){
    int n ;
    cout<<"Enter the integer value till you want to print :";
    cin>> n;
    pattern4(n);
}