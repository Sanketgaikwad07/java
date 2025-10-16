import java.util.Scanner;

 class funcation {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printMyName(name);//calling the funcation inside in onther funcation
    }
}
