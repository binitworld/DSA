#include <bits/stdc++.h>
using namespace std;

int main(){
    int marks;
    cout<<"Enter your marks :" ;
    cin>>marks;

    if (marks <35){
        cout<<"You are failed this paper ! "<<endl;
    }else if (marks>=35){
        cout<< "You are passed this paper !"<< endl;
    }else if (marks >= 70  ){
        cout << "You had done a great job ! Keep it up ";
    }else {
        cout<< "you achiveer ";
    }

    return 0;
    
}