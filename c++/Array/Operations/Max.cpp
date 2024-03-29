/*Finding Maximum of a Group of an Array*/
#include<bits/stdc++.h>
using namespace std;

int MaxElement(int numbers[], int n){
    int max = INT_MIN;
    for(int i = 0 ; i< n ; i++){
        if (numbers[i]> max){
            max = numbers[i];
        }
    }
    return max;

}
int main(){
    int n;
    cin>>n;
    int numbers[1000];

    for(int i=0 ; i< n; i++){
        cin>>numbers[i];
    }
    cout<< "The maximum integer  among the stored in this array is : "<<MaxElement(numbers,n)<<endl;
    return 0;
}






























