#include <bits/stdc++.h>
using namespace std;
int main(){
    int arr[5] = {3,2,1,5,2};
    int largest   = arr[0];
    for (int i = 0; i <sizeof(arr[0]); i++)
    {
        if (arr[i]>largest){
            largest=arr[i];
        }
    }cout<<largest<<endl;
    return 0;
    
}