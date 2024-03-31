#include<bits/stdc++.h>
using namespace std;
int Subtract(int arr[], int n){
    int sub = 0;
    for(int i = 0 ; i<n;i++){   
        sub -= arr[i];
    }
    return sub;
}
int main(){
    int n;
    cin>> n;

    int arr[100];
    for (int i = 0 ; i<n; i++){
        cin>> arr[i];
    }
    cout<< "The subtraction of all element of array : " << Subtract(arr, n)<<endl;
    return 0;
}