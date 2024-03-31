#include<bits/stdc++.h>
using namespace std;
void Update(int arr[], int n){
    arr[0] = 34;
    for(int i = 0; i<n; i++){
        cout<< arr[i] << " ";
    }
    cout<< endl;
}

int main(){
    int n;
    cin>>n;

    int arr[100];
    for( int i = 0; i<n; i++){
        cin>>arr[i];
    }
    Update(arr, n);
    cout<<endl;
}
