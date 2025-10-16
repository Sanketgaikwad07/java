import java.lang.reflect.Array;
import java.util.ArrayList;

 class lambda {

    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<Integer>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.size();
        System.out.println(number);
        int sum=0;
        for(int n:number){
            sum+=n;
            if(sum==10){
                System.out.println("BUG");
            }else{
                int ss=0;
                ss*=sum;
                System.out.println(ss);
            }

        }     System.out.println("sum s array = "+sum);


        number.forEach((n)->{
            System.out.println(n);
        });
    }
}

