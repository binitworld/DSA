/*
Functions:
Functions are set of code which perform something for you 
Functions use to  modularise the code 
Functions are used to same code multiple Times 

Types of func 
1. void-->Does not return anything
2. return->
Parameterized
Non-parameterized
*/
#include <bits/stdc++.h>
using namespace std;
void printName(string name) {
cout << "hey " << name;
}
int main() {
string name;
cin >> name;
printName (name);
return 0;

}