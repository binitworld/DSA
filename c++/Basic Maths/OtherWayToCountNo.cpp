#include<bits/stdc++.h>
using namespace std;
int CountNumber(int n){
    int cnt = (int)(log10(n)+1);
    return cnt;
}
int main(){
    int n;
    cin>> n;
    cout << CountNumber(n) <<endl;
    return 0;
}