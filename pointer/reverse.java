#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "Hello, World!";
    char *start = str;
    char *end = str + strlen(str) - 1; // Pointer to the last character

    while (start < end) {
        // Swap the characters
        char temp = *start;
        *start = *end;
        *end = temp;
        start++; // Move start pointer forward
        end--;   // Move end pointer backward
    }

    printf("Reversed string: %s\n", str);
    return 0;
}
