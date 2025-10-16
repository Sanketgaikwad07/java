import java.util.Scanner;

 class or {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num1=5;//0101->0111->dec 7
        int num2=1;

        int bitmask= 1<<num2;
        if(n==1){
            int newNamber=bitmask|num1;
            System.out.println(newNamber);
        }else{
            int newBitmask=~bitmask;
            int newNamber= newBitmask &n;
            System.out.println(newNamber);
        }

    }
}
