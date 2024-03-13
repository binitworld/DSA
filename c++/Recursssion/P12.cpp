#include<bits/stdc++.h>
using namespace std;

int sit(int m){
    if (m==0){
        return 0;
    } 
    return m - sit (m-1);

}
int main(){
    int m = 0 ;
    cout << "m = ";
    cin>>m;
    cout << "Result is : "<< sit(m)<< endl;
    return 0; 
}