class overloading {
static int myNumber(int x,int y){
    return x*y;
}
static float myNumber(float x, float y){
    return x/y;
}
static  char myNumber( char x,int y){
    return x ;
}

    public static void main(String[] args) {
        int num1=myNumber(3,8);
        int num2=myNumber(-699,98);
        System.out.println(num1);
        System.out.println(num2);
        int num3=myNumber("sanket".charAt(0), 3);
        System.out.println(num3);
    }



}

