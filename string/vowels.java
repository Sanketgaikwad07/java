#include <stdio.h>

int main() {
    int arr[] = {3, 5, 2, 8, 6};
    int *ptr = arr;  // Pointer to the first element
    int max = *ptr;  // Initialize max with the first element
    int size = sizeof(arr) / sizeof(arr[0]);
    int count = 0;

    while (count < size) {
        if (*ptr > max) {
            max = *ptr; // Update max if current element is larger
        }
        ptr++;  // Move the pointer to the next element
        count++; // Increment the count
    }

    printf("Maximum element: %d\n", max);
    return 0;
}
