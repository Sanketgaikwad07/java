public class nested {
    public static void main(String[] args) {

        interface math {
            int opreation(int a, int b);

        }
        math addition=(a,b)->a+b;
        System.out.println(addition.opreation(134,12));
    }

//    class Inner {
//        void show() {
//                        System.out.println("can you this program");
//                    }
//                }
//            }
//
//public static void main(String[] args) {
//
//nested.Inner obj=new nested().new Inner();
//obj.show();
}