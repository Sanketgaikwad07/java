import java.util.HashSet;
import java.util.Set;

public class FindNewElement {
    public static void main(String[] args) {
        int[] existingElements = {1, 2, 3, 4, 5};
        int newElement = 6; // Change this value to test with different new elements

        if (isNewElement(existingElements, newElement)) {
            System.out.println(newElement + " is a new element.");
        } else {
            System.out.println(newElement + " already exists.");
        }
    }

    public static boolean isNewElement(int[] elements, int newElement) {
        Set<Integer> elementSet = new HashSet<>();
        for (int element : elements) {
            elementSet.add(element);
        }
        return !elementSet.contains(newElement);
    }
}
