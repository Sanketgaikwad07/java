package Question;

public class reverseNode {
    public static void main(String[] args) {
        int []a={2,4,6,8,0};
        reNode(a);
        System.out.print("The reverse number : ");
        for(int i:a){
            System.out.print(i+" ");
        }
    }
    static void reNode(int[] arr){
        int i=0;
        int n=arr.length-1;
        while(i<n){
            int T=arr[i];
            arr[i]=arr[n];
            arr[n]=T;
            i++;
            n--;

        }
    }
}

