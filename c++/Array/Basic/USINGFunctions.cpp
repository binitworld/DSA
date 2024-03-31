#include<bits/stdc++.h>
using namespace std;
void PrintArray(int arr[], int size){
    for (int i=0; i<size;i++){
        cout << arr[i]<<" ";
    }
    cout<< endl;

}
int main(){
    int firstArray[14]={1,3,4,5,6,7};
    int n= 14 ;
    
    PrintArray(firstArray, 14);
    return 0;
}