 class This {
    public This() {
        this("done");
        System.out.println("Default constructor");
    }

    public This(String msg) {
        System.out.println("Message: " + msg);
    }



public static void main(String[] args) {
    This T=new This();
}
}
