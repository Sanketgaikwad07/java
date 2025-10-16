class muliaipliactione {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        //int mall = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println("is not bug , is a math ");
            } else {
                int square=arr[i]*arr[i];

                System.out.println("number=" + square);
            }
        }
    }
}
