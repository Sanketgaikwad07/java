 class sumk {
   final  int x;  // Class variable x

    // Constructor with one parameter x
    public sumk(int y) {
       this.x=y;



    }

    public static void main(String[] args) {
        // Create an object of Main and pass the value 5 to the constructor
       sumk myObj = new sumk(5);

        System.out.println(myObj.x);
    }
}
