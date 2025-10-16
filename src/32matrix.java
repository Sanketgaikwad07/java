import java.util.Scanner;

class matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][]number=new int[row][col];
        //input
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               number[i][j]=sc.nextInt();
            }

        }
        //output
        int x=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(number[i][j]==x){
                    System.out.println("X found i xth position "+i  +j);
                }
                System.out.println();
            }
        }
    }
}
