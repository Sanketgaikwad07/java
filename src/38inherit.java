  class inherit {
     protected String name="BMW";

     public void brand() {
         System.out.println("the car is my");
     }
 }
    class gadi extends inherit{
        private String compay="BMW";
        private int carNumber=1290;



        public static void main(String[] args) {
     gadi mycar=new gadi();
     mycar.brand();
            System.out.println(mycar.name+" "+mycar.carNumber+" "+mycar.compay);
     }
            }
