 class Minmaxize {
    public static void main(String[] args) {
        int []arr={10,22,32,14,15,76,77,7};
        int sum=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<sum){
                sum=arr[i];
            }
        }
        System.out.println(sum);
    }
}
