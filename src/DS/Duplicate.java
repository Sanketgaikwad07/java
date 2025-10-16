//
//package DS;
//
//import java.util.HashMap;
//import java.util.Map;
//
//class CountDuplicates {
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 2, 0, 5, 6, 0, 5, 5, 3};
//
//        // HashMap to store (Element -> Count)
//        Map<Integer, Integer> frequencyMap = new HashMap<>();
//
//        // 1. Traverse the array and populate the map
//        for (int element : array) {
//            // Get the current count (defaulting to 0 if not present) and increment it by 1
//            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
//        }
//
//        // 2. Iterate through the map to print the counts of duplicates
//        System.out.println("Element Frequency Count:");
//
//        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//            int element = entry.getKey();
//            int count = entry.getValue();
//
//            // Print only the elements that appeared more than once (duplicates)
//            if (count > 1) {
//                System.out.println("Number " + **element** + " came " + **count** + " times.");
//            }
//        }
//    }
//}
//
//
//
////    package DS;
////
////    class  FindDuplicates {
////        public static void main(String[] args) {
////            int[] array = {1, 2, 3, 4, 2,0, 5, 6,0, 5,5, 3};
////            System.out.println("Duplicate elements found using Nested Loops:");
////
////            for (int i = 0; i < array.length - 1; i++) {
////                for (int j = i + 1; j < array.length; j++) {
////                    if (array[i] == array[j]) {
////                        System.out.println("Duplicate found: " + array[i]);
////
////                    }
////                }
////            }
////        }
////    }
////    // time complexity = O(n^2)
////    //space complexity=O(n)