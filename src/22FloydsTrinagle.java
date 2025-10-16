 class FloydsTrinagle {
    public static void main(String[] args) {
        //System.out.println(1);
        int n=5;
        int number=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;//number=number+1
            }
            System.out.println();
        }
    }
}
