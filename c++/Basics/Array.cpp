#include <bits/stdc++.h>
using namespace std;
int main(){
    int arr[5];
    for (size_t i = 0; i < 5; i++)
    {
        cout<<"Enter the array you want to store at " << i <<":";
        cin>>arr[i];
    }
    cout<<"Your results are";
    for(size_t i = 0; i < 5; i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    
    
    return 0;
}
