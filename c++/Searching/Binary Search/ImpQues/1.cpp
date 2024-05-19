#include<bits/stdc++.h>
using namespace std;
int firstOccurrence(int arr[], int n, int k){
    int s = 0;
    int e = n -1;
    int mid = s+(e-s)/2;
    int ans = -1;

    while(s<=e){
        if(arr[mid]==k){
            ans= mid;
            e = mid-1;
        }
        else if(k>arr[mid]){
            s= mid+1;
        }else if(k <arr[mid]){
            e = mid-1;
        }
        mid= s+(e-s)/2;

    }
    return ans;
}
int LastOccurrence(int arr[], int n, int k){
    int s = 0;
    int e = n -1;
    int mid = s+(e-s)/2;
    int ans = -1;

    while(s<=e){
        if(arr[mid]==k){
            ans= mid;
            e = mid-1;
        }
        else if(k>arr[mid]){
            s= mid+1;
        }else if(k <arr[mid]){
            e = mid-1;
        }
        mid= s+(e-s)/2;

    }
    return ans;
}

int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i = 0 ; i<n; i++){
        cin>>arr[i];
    }
    int k ;
    cout<< "Enter the value you are looking"<<endl;
    cin>>k;
    int firstIndex = firstOccurrence(arr, n, k);
    if(firstIndex!= -1){
        cout<< "Target Element for first occurrence is found at "<< firstIndex << endl;
    }
    else{
        cout<< "Target element is not founded !!";
    }
    int lastIndex=LastOccurrence(arr, n, k);
    if(lastIndex != -1){
        cout<< "Target Element for last occurrence is found at "<< lastIndex << endl;
    }
    else{
        cout<< "Target element is not founded !!";
    }
    return 0;
}
