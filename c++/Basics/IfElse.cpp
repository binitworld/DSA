// Write a program  that prints if you are adult or not.

#include <bits/stdc++.h>
using namespace std;

int main(){

    int age;
    cout<<"Enter your age : ";
    cin >> age;

    if(age <=10 ){
        cout<<"You are a Kid !";
    
    }else if(age >=10 && age <=17){
        cout<<"You are a teenager !";
    }else{
        cout<<"You are an adult and Mature Person!";
    }
    return 0;
}