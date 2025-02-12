class fuction {

    public static void main(String[] args) {
        //  printfirstpattren();
        printSecondpattern();
//        printthridpattern();
    }

    public static void printthridpattern() {
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
    }

    public static void printSecondpattern() {

        // public static void printfirstpattren() {
//            System.out.println("*");
//            System.out.println("**");
//            System.out.println("***");
//            System.out.println("****");
//            System.out.println("*****");
//


        int rows = 0;
        while (rows < 50) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print("*");

                i++;
            }
            System.out.println();
            rows++;


        }


        // do anything as mach you think
    }
}


