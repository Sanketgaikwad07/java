 class Overloding {
     public static void main(String[] args) {

         Overloding obj=new Overloding();
         obj.print("output");
         obj.print(2);
         obj.print(4);
         obj.printf(2,"output");
         obj.printf(5,"LA");

     }
    public void print(String filename) {
        System.out.println("Printing file: " + filename);
    }

    public void print(int copies) {
        System.out.println("Printing " + copies + " copies");
    }

    public void printf(int copies, String filename) {
        System.out.println("Printing " + copies + " copies of " + filename);
    }
}
