package String;

import java.util.Arrays;

public class revere {

    static void revereString(char[] arr) {

        int n = arr.length;
        int i = 0;
        int t = n - 1;

        while (i <= t) {

            char temp = arr[i];
            arr[i] = arr[t];
            arr[t] = temp;
            i++;
            t--;
        }
return ;
    }

    public static void main(String[] args) {
String str="sanket";
char[] ch=str.toCharArray();
      revereString(ch);
        System.out.println(String.valueOf(ch));
    }




    }


//    public static void main(String[] args) {
//        String str="sanket";
//        StringBuilder str1=new StringBuilder(str);
//        str1.reverse();
//        System.out.println(str1);
//    }
//}
