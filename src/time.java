
    enum level{
        LOW,
        medium,
        high
    }
    public class time {
    public static void main(String[] args) {

        level lolo=level.valueOf("sanket");
        switch (lolo){
            case LOW : System.out.println("its my car be slow...");
            break;
            case high:
                System.out.println("its high level");
                break;
            case medium:
                System.out.println("its medium level");
                break;
        }
    }
}
