#include <stdio.h>

void foo(int n, int *sum) {
    int k = 0, i = 0;
    if (n == 0) return;
    k = n % 10; // Fixed: correctly computing k as the last digit of n
    i = n / 10; // Fixed: correctly computing i as n without its last digit
    *sum = *sum + k; // Using a pointer to accumulate sum
    foo(i, sum); // Passing the address of sum to recursively accumulate it
    printf("%d", k); // This prints the last digit of n, then the second-to-last, and so on in each recursive call
}

int main() {
    int a = 2048, sum = 0;
    foo(a, &sum); // Passing the address of sum so it can be modified by foo
    printf("\n%d\n", sum); // Prints the newline after the digits have been printed, then the sum
    getchar(); // Waits for a character input to keep the console window open on some systems
    return 0;
}
