#include <bits/stdc++.h>
using namespace std;

void vectors(){
    vector<int> v;
    v.push_back(1);
    v.emplace_back(2);

    vector<pair<int,int>>vec;

    vector <int> v(5,100);
    vector <int> v(5);// in this case we had created 5  null  vectors in a containers {0,0,0,0,0}
    vector <int> v1(5,20); //declaring {20,20,20,20,20}---> to increase the size after 5 we have to enter the v.push_back(1) function after this line
    vector <int> v2(v1);

// ACCESS ELEMENT IN A VECTOR 

cout<<v[0]<<" "<<v.at(0); //sIMILAR LIKE AN ARRAY CALL OR LOCATER FOR EG, having vector v==> {1,2,3,4,5} so if i want to call the inside value at 4th position we use either cout <<v[3]  or  cout << v.at(3);
// Another way is use of iterator function   

vector<int> ::iterator it =v.begin();
it++;// to goe next
cout<<*(it)<<" ";

it = it+2;
cout << *(it)<< " ";
vector <int> ::iterator it =v.end();// after the last element point
vector <int> ::iterator it =v.rend();// rend pointing to first element in container
vector <int> ::iterator it =v.rbegin();// at the last element point.

cout<< v.back() << " ";



}


int main(){
    vectors();
    int v;
    cin>>v;
    return 0;
}