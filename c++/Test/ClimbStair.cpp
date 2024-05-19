#include<bits/stdc++.h>
using namespace std ;
int DpStep(int n){
    if(n<= 0){
    return 0;
    }    
    else if(n <=1) {
        return 1;
    }
    else{
        int step[n+1];
        step[0]=1;
        step[1]=1;
        for(int i=2;i<n;i++){
            step[i]=step[i-2]+step[i-1];
        }
    }
    return step[n];
}
int main(){
    int n;
    cin>> n ;
    cout<<DpStep(n)<<endl;
    return 0;
}