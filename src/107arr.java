 class arr {
    public static void main(String[] args) {
        int arr[] = {1, 4, 4, 5, 6, 7, 8, 9, 2, 3, 45};
        int arr1[] = {4, 6, 8, 9};
        int Min = Math.min(arr.length, arr1.length);
        for (int i = 0; i < Min; i++) {


            System.out.println(arr[i] + " "+arr1[i]+(arr[i]*arr1[i]));


        }
    }
}