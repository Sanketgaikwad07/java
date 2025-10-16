public class BubbleSort {
    public static void primu(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={4,2,7,8};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[1]){
                    //swap
                    int team=arr[j];
                    arr[j]=arr[i+1];
                    arr[i+1]=team;
                }
            }
        }
        primu(arr);
    }
}
