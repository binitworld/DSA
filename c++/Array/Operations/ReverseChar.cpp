#include <bits/stdc++.h>
using namespace std;
void ReverseChar(char arr[], int n){
    int start = 0 ;
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
    char arr[100];
    for(int i = 0 ; i< n; i++){
        cin>> arr[i];
    }
    ReverseChar(arr, n);
    cout<<"The reversed charater inside the array are ";
    for(int i =0; i<n; i++){
        cout<<arr[i]<< " ";
    }
    cout<<endl;
    return 0;
}