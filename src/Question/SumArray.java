package Question;

public class SumArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,3,1};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=i;
            System.out.println("the sum of array is = "+ sum);
        }
    }
}
