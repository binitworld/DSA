#include <bits/stdc++.h>
using namespace std;

int main(){

    char arr[7]={'a','b','c','d','e','f','g'};

    int n = sizeof(arr)/sizeof(arr[0]);

    for (int i = 0 ; i <n; i++){

        cout << arr[i]<< endl;
    }
    return 0;
}