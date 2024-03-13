#include<bits/stdc++.h>
using namespace std;
int main(){
    char input;
    cout<< "Enter the value : ";
    cin>>input;
    
    if(input>='0' && input<='9'){
        cout<<"the number is integers/numeric "<<endl;

    }else if(input >='a' && input <='z'){
        cout<< "The alphabet is a lowe case "<<endl;

    }else if (input >= 'A' && input <= 'Z'){
        cout<<"The Alphabet is a Upper Case "<<endl;
    }else{
        cout<<"This is Invalid Input "<< endl;
    }
    return 0;
}