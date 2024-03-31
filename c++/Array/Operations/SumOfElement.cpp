#include<bits/stdc++.h>
using namespace std;
int Sum(int arr[], int n){
    int submission=0;
    for(int i = 0 ; i<n; i++){
        submission = submission+arr[i];
    }
    cout <<"The sum of element of this array is :";
    return submission;
}
int main(){
    int n ;
    cin>> n;

    int arr[100];
    for (int i = 0 ; i<n ; i++){
        cin>>arr[i];
    }
    cout<<Sum(arr, n)<<endl;
    return 0;

}