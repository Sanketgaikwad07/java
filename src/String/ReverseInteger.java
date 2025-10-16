package String;

public class ReverseInteger {
    public static void main(String[] args) {

        System.out.println( reverint(1234));
    }
    static int reverint(int num){
        int i=0;
        while(num!=0){
//            if(num==0){
//                System.out.println("flaut");
//            }else{
//                System.out.println("all ok");
//            }
            int digit=num%10;

            if(i>Integer.MAX_VALUE/10||i<Integer.MIN_VALUE/10){

                return 0;
            }


            i=(i*10)+digit;
            num=num/10;
        }
        return i;
    }
}
