class arraySorted {
    public static void main(String[] args) {
        System.out.println("welcome the sorted\n");
        int[] numArr = ArrayUtilites.inputArray();
        boolean isIsc = isIncreasing(numArr);
        boolean isdec = isdecreasing(numArr);
        if (isIsc || isdec) {
            System.out.println("your array are sorted");
        } else {
            System.out.println("your array are not sorted");
        }

    }

    public static boolean isIncreasing(int[] numArr) {
        int i = 1;
        while (i < numArr.length) {
            if (numArr[i] > numArr[i - 1]) {
                return false;
            }
            i++;
        }


        return true;
    }

    public static boolean isdecreasing(int[] numArr) {
        int i = 1;
        while (i < numArr.length) {
            if (numArr[i] > numArr[i - 1]) {
                return false;
            }
            i++;
        }


        return true;
    }
}
