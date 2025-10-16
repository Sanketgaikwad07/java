import java.util.Arrays;

 static class rotate {
     public rotate(int[] a) {
     }

     static void rotate(int[] a) {
        int teamp = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = teamp;
    }
    public void duplicate(int []nums){
         
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                System.out.println("true");
            }

        }
        System.out.println("false");

    }
}

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
   new rotate(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
