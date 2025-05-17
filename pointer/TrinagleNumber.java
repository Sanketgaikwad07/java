class Triangle{
  public static void main(String[]args{
  int n=5;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        int sum =i+j;
        if(sum % 2 ==0){
          Stsyem.out.print("1 ");
        }else{
          Stsyem.out.print("0 ");
        }
      }
      Stsyem.out.println();
    }
  }
}
