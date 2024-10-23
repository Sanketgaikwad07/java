#include <stdio.h>

int main() {
    int arr[] = {1, 2, 3, 4, 5};
    int *ptr = arr;  // Pointer to the first element
    int sum = 0;
    int size = sizeof(arr) / sizeof(arr[0]);
    int count = 0;

    while (count < size) {
        sum += *ptr; // Add the value pointed to by ptr
        ptr++;       // Move the pointer to the next element
        count++;     // Increment the count
    }

    printf("Sum of array elements: %d\n", sum);
    return 0;
}
