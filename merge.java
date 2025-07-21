class merge{
  public static void main(String[]args){
    int num1={10,20,30,31,11,98,38,33,90,09,87};
    int num2={12,31,34,75,11,56,87,1,5,89,76,3};
    int a=num1.length;
    int b=num2.length;
    
      int c=a+b;
        int []c1=new int [c];
      System.arraycopy(num1,0,c,0,a);
        System.arraycopy(num2,0,c,0,b);
    
         System.out.printl(" "+array.toString(c));
    }
  }

   
        
