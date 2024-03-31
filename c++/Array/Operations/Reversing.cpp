#include<bits/stdc++.h>
using namespace std;
void ReverseOfArray(int arr[], int n){
    int start = 0;
    int end = n-1;
    while(start<= end){
        swap(arr[start], arr[end]);
        start++;
        end--;
    }
}
int main(){
    int n;
    cin>>n;

    int arr[100];
    for(int i = 0 ; i<n ; i++){
        cin>>arr[i];
    }
    ReverseOfArray(arr, n);
    cout<<"The Reverse  of elements in  array  is : ";
    for(int i= 0 ; i < n; i++){
        cout<< arr[i]<< " ";
    } 
    cout<<endl;
    return 0;
}