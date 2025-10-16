package Question;

public class Matrix {
    public static void main(String[] args) {
        int [][] A={{1,2,3,4},{5,4,3,2}};
        int [][] B={{5,6,7,8},{0,9,8,7}};


        int[][] C=new int[A.length][B[0].length];

        for(int i=0;i<A.length;i++){
            for(int j=0;j<B[0].length;j++){
                for(int k=0;k<B.length;k++){


                C[i][j]+=(A[i][k]*B[k][j]);

                }
            }
        }
        System.out.println("result matrix is: ");
        for(int i=0;i<C.length;i++){
            for(int j=0;j<C[0].length;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println( );
        }
    }
}
