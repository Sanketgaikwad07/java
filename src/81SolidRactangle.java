import java.util.Scanner;

 class StarPrint {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first side: ");
            int n = sc.nextInt();;
           // System.out.print("Now,Enter the second side: ");
            int m = sc.nextInt();;



            //outer line
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    System.out.print("*");
                }
                System.out.println( );
            }

            }
        }



