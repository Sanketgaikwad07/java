import javax.swing.*;
import java.util.Calendar;

public class simpson {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Today date is:  " + cal.getTime());
        System.out.println("Current Calendar's Day: " + cal.get(Calendar.DATE));
        System.out.println("Time: " + cal.get(Calendar.AM_PM));
        System.out.println("Current week: " + cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current SECOND:" + cal.get(Calendar.SECOND));



        int arr1[]={1,3,4,5,6,7};
        int arr2[]={1};

int arr3[]=new int[1];
int sum=0;


for(int i:arr1){
    sum+=i;
}
for(int j:arr2){
    sum+=j;
}
 arr3[0]=sum;
        System.out.println("the sum of array is "+ arr3[0]);




//        for(int i=0;i<arr1.length;i++){
//            int arr3[i]=arr1[i];
//        }
//        for(int j=0;j<arr2.length;j++){
//            arr3[arr1.length+j]=arr2[j];
//        }
//        for(int h:arr3){
//            System.out.print(h);
//            int sum=0;
//            sum+=h;
//            System.out.print(sum);
//        }
//



//        System.arraycopy(arr1,0,arr3,0,arr1.length);
//        System.arraycopy(arr2,0,arr3,0,arr2.length);
//        System.out.println(ArraytoString(arr3));
//


    }

}

