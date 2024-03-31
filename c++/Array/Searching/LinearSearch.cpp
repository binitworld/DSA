#include<bits/stdc++.h>
using namespace std;
void LSearch(int arr[], int n){
    int target;
    cout<<"Enter the target element : ";
    cin>>target;
    bool found = false;
    for (int i = 0 ; i<n; i++){
        // cout<<arr[i]<<endl;
        if ( arr[i]==target){
            cout << "The target element is founded at index "<< i;
            found = true;
            break;
        }
    }
    if(!found){
        cout<< "The entered Target value doesn't Match with the elements stored in this array";
    }
}
int main(){
    int n ;
    cin>>n;
    int arr[ 100 ];
    for (int i =0 ; i < n; i++){
        cin >> arr[i];
    }
    LSearch(arr,n);
    cout<<endl;
    return 0;
}