 class ForEach {

     public static void main(String[] args) {
         String[]array=new String[]{
                 "Ram","Sanket","Mohan","Shakti"
         };
       //  printArray(array);
     printArrayForeach(array);
     }
     public static void printArrayForeach(String[] array){
         for(String name:array){
             System.out.println(name);
         }
     }
    public static void printArray(String[] array){
         for(int i=0;i<array.length;i++){
             System.out.println(array[i]);
         }
    }


}
