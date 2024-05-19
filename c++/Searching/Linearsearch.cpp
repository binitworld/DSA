#include<bits/stdc++.h>
using namespace std;
void Lsearch(int arr[],int n  ){
    int target;
    cout<<"Enter the target element : ";
    cin>>target;
    bool found = false;
    for (int i = 0; i<n; i++ ){
        if(arr[i]==target){
            cout<<"Target element is founded at "<< i+1 <<endl;
            found = true ;
            break;
        }
    }
    if(!found){
        cout<<"Entered Target Element doesn't Exist ! " <<endl; 
    }
}
int main(){
    int n;
    cin>>n;
    int arr[1000];
    for (int i = 0 ; i <n ; i++){
        cin>>arr[i];
    }
    Lsearch(arr, n);
    cout<< endl;
    return 0;
}