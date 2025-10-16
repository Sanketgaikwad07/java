package Aashai;
import java.util.ArrayList;

import java.util.Arrays;

public class findSubset {

    public static boolean isSubset(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // If list2 is larger than list1, it cannot be a subset
        if (list2.size() > list1.size()) {
            return false;
        }

        // Iterate through each element in list2
        for (Integer element : list2) {
            // Check if the current element from list2 is present in list1
            if (!list1.contains(element)) {
                // If an element is not found, list2 is not a subset of list1
                return false;
            }
        }
        // If all elements of list2 are found in list1, then list2 is a subset
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(3, 4, 5));
        ArrayList<Integer> listC = new ArrayList<>(Arrays.asList(7, 8));

        System.out.println("Is listB a subset of listA? " + isSubset(listA, listB)); // Expected: true
        System.out.println("Is listC a subset of listA? " + isSubset(listA, listC)); // Expected: false
    }
}