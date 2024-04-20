#include<bits/stdc++.h>
using namespace std;

void Swapping(int num[], int size){
    for (int i = 0 ; i+1<size; i+=2){
        //without using swap function 
        int temp = num[i];
        num[i]= num[i+1];
        num[i+1]= temp;
    }
}
int main(){
    int size;
    cin>> size;
    int num[1000];
    for(int i = 0 ; i<size ; i++){
        cin>>num[i];
    }
    Swapping(num,size);
    cout <<"Swapped numbers are :";
    for(int i= 0 ;i<size; i++){
        cout<<num[i]<< " ";
    }
    cout<<endl;
    return 0;

}
