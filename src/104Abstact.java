


abstract class vehical {

    //Abstract method
    abstract void acceleter();
    abstract void breke();

    //concrate method
    void StartEngie() {
        System.out.println("Engine Started..");

    }
}
class car extends vehical {
    @Override
    void acceleter() {
        System.out.println("Car: preesing gas pedal");
        //hidden complx logic
    }

    @Override

    void breke () {
            System.out.println("Cr is appling  brake");
        }
    }

    class Abstact {

        public static void main(String[] args) {
            vehical V = new car();
            V.acceleter();
            V.breke();
            V.StartEngie();
            V.breke();

        }

    }
