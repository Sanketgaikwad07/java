public class loopp {

    public static void main(String[] args) {
        int n=1;
        while (n!=10){
        n+=2;
        n*=2;
        int sum=0;
        sum*=n;
        for(int i=1;i<(n)+n;i++){
            sum=i;

           int divid= sum*i;
            System.out.println(divid);
        }
        if(n>=13){
            System.out.println("is a done");
            break;
        }
        System.out.println("n= "+n);
            System.out.println(sum);
    }
}}//Infinite loop
