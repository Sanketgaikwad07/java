package Pattern;

public class Pyramid {
    static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {// outer loop print the rows
            for (int j = 1; j <= i; j++) {// inner loop print the columns
                System.out.print(i + " ");//print the col value and row values
            }

            System.out.println(" "); //print the new line
        }
    }

    public static void main(String[] args) {
        String str = "sanket";
        char[] letter = str.toCharArray();
        for (char c : letter) {
            int ascii = (int) c;
            System.out.println(c + "-> " + ascii);
            int num=Integer.parseInt("12344");
            System.out.println(num  );
            //System.out.println(letter);
//            int n = 10;
//            pyramid(n);
        }
        String syr="sanket";
        StringBuilder stu=new StringBuilder(syr);
        stu.reverse();
        System.out.println(stu);
    }
}