#include <bits/stdc++.h>
using namespace std;

int search(int Even[], int n, int key) {
    int start = 0;
    int end = n - 1;
    int mid = (start + end) / 2;

    while (start <= end) {
        if (Even[mid] == key) {
            return mid;
        }
        if (key > Even[mid]) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
        mid = (start + end) / 2;
    }
    return -1;
}

int main() {
    int n;
    cin >> n;

    int key;
    cout << "Enter the element you are looking for: ";
    cin >> key;

    int Even[n];
    for (int i = 0; i < n; i++) {
        cin >> Even[i];
    }

    int index = search(Even, n, key);
    if (index != -1) {
        cout << "Element found at index " << index << endl;
    } else {
        cout << "Element not found" << endl;
    }

    return 0;
}
