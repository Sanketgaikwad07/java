package Loop;

import java.util.Scanner;

 class Positive {
    public static void main(String[] args) {
        double sum=0.0;
        int count =0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Positive num Avg are....");

        while(true){
            System.out.print("Enter the poisitive the number: ");

            if(!sc.hasNextDouble()){
                System.out.println("Invlid number");
            sc.next();
            continue;

            }
            double num=sc.nextDouble();
            if(num<0){
                System.out.println("Non-positive number");
                break;//exit the loop
            }
            sum+=num;
            count+=1;


        }
        if(count>0){
            double Avg=sum/count;
            System.out.println("The total sum is: "+sum);
            System.out.println("The total count is: "+count);
            System.out.printf("the final output is : "+count,sum,Avg);

        }else{
            System.out.println("Non-positive the number you entered");
            if(sum!=0);
            System.out.println("The  sum is a not equal to the =0");
        }
    }
}