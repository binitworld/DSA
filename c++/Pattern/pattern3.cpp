#include <bits/stdc++.h>
using namespace std;
void pattern3(int n){
    int i,j;
    for (i =1; i<=n; i++){
        for ( j = 1;  j<=i ; j++)
        {
            cout<<j<<" ";
        }
        cout<<endl;
    }
}
int main()
{
    int n;
    cout<<"enter the integer upto which you want to print the pattern :";
    cin>>n;
    pattern3(n);
}