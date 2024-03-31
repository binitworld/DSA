#include <bits/stdc++.h>
using namespace std;

int Multiplication(int arr[], int n){
    int mul= 1 ;
    for(int i =  0 ; i< n; i++){
        mul *= arr[i];
    }
    return mul;

}
int main (){
    int n ; 
    cin >> n;

    int arr[100];
    for (int i = 0 ; i< n; i++){
        cin>> arr[ i];

    }
    cout<<" The multiplication of each element is : "<< Multiplication(arr, n)<<endl;
    return 0;
}