import java.io.*;
 class inheri {

     // Java Programs to illustrate
// use of Interface to solve
// Diamond Problem


     // Interfaces Declared
     interface Parent1 {
         void fun();
     }

     // Interfaces Declared
     interface Parent2 {
         void fun();
     }

     // Inheritance using Interfaces
     class test implements Parent1, Parent2 {
         public void fun()
         {
             System.out.println("fun function");
         }
     }

     // Driver Class
     class test1 {
         // main function
         public static void main(String[] args)
         {
             inheri t = new inheri();
         }
     }
}

