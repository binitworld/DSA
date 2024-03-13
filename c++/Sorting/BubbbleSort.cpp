#include <bits/stdc++.h>
using namespace std;
int didSwap =0;
void bubbleSort(int arr[], int n) {
    for(int i =(n-1);i>=1;i-- ){
        for(int j=0; j<=i-1;j++){
            if(arr[j]>arr[j+1])
            swap(arr[j],arr[j+1]);
            didSwap = 1;
        }
        if (didSwap==0){
            break;
        }
        cout<<"Run\n";
    } 
}
int main() {
    int n;
    cout << "n : ";
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    bubbleSort(&arr[0],n);
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    return 0;
}