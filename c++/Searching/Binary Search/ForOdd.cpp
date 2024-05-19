#include <bits/stdc++.h>
using namespace std;
int BSearch(int arr[], int n, int key){

    int start = 0 ;
    int end = n-1;

    int mid =start+(end-start)/2;
    while(start<=end){
        if(arr[mid]==key){
            return mid;
        }
        if(key >arr[mid]){
            start= mid+1;
        }
        else{
            end= mid - 1;
        }
        mid=start+(end-start)/2;
    }
    return -1;
}
int main(){
    int n ;
    cin>> n;
    int key ;
    cout<<"enter the the key element you are looking at : ";
    cin>>key;
    int arr[n];
    for (int i =0; i<n;i++){
        cin>>arr[i];

    }
    int index = BSearch(arr, n, key);
    if(index != -1){
        cout<<"Element was found at"<<index<<endl;
    }else{
        cout<<"Target Element was not found !"<<endl;
    }
    return 0;

}