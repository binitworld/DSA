/*Finding Minimum of a Group of an Array*/
#include<bits/stdc++.h>
using namespace std;

int MinElement(int array[] ,int n ){
    int min = INT_MAX;
    for(int i = 0 ; i< n; i++){
        if (array[i]<min){
            min = array[i];
        }
    }
    return min;
}
int main(){
    int n;
    cout<<"enter The size of the array : "<<endl;
    cin>>n;

    int array[100];
    cout<< "Enter the element of  array with a space b/w them : "<<endl;
    for ( int i = 0 ; i< n; i++){
        cin >> array[i];
    }
    cout<<"The Minimum number in this array is : "<<MinElement(array, n) <<endl;
    return 0;
}