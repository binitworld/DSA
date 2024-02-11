/*Take the day no. print the corresponding day
for 1 monday ,
for 2 Tuesday, And so on for 7 print sunday*/


#include <bits/stdc++.h>
using namespace std;

int main(){
    int day;
    cout<<"Enter the day number from (1-7) :";
    cin>>day;

    switch (day)
    {
    case 1:
        cout<<"Today is 'Monday' ";
        break;
    case 2:
        cout<<"Today is 'Tuesday' ";
    break;
    case 3:
        cout<<"Today is 'Wednesday' ";
    break;
    case 4:
        cout<<"Today is 'Thursday' ";
    break;
    case 5:
        cout<<"Today is 'Friday' ";
    break;
    case 6:
        cout<<"Today is 'Saturday' ";
    break;
    case 7:
        cout<<"Today is 'Sunday' ";
        break;
    }
    return 0;
}