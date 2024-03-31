#include <bits/stdc++.h>
using namespace std;
void MaxEle(int Vardhan[], int n ){

    int  max = INT_MIN;
    for( int i = 0 ; i < n ; i++){
        if(Vardhan[i]> max){
            max= Vardhan[i];
        }
    }
}
int main(){
    int n ;
    cout<<"Enter the size of the element";
    cin>>n;
    int Vardhan[1000];
    cout<<"Enter the element of  array with a space b/w them : " ;
    for(int i=0 ; i< n; i++){
        cin >> Vardhan[i];

    } 
    cout <<"The Maximum number in this array is :"<<MaxEle ( Vardhan, n )<< endl;
}
