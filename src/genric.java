import java.security.cert.CertPathBuilderResult;
import java.util.ArrayList;
import java.util.Arrays;

public class genric<T> {
    void printnumber(int... numbers){
        for(int num:numbers){
            System.out.println(num);
        }
    printnumber(1,2,39,4,5);
        System.out.println(numbers);

    }








    private T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }

    public static void main(String[] args) {
        genric<Integer> box = new genric<>();
        box.setValue(210);
        Integer i = box.getValue();

        System.out.println(i);
        int result;
        try {
            result = 100 / 10;

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("cannot  do divide");
        } finally {
            System.out.println("Always executed");



        }
        int b[]={1,2,3,4,5,6};
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

    }
//    Integer a=Integer.valueOf(100);
//    Double d=Double.valueOf(2.2);
//




}
