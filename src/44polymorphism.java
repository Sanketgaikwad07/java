
class Animal {
   public  void run(){

        System.out.println("bhag saale");
    }
}

class Dog extends Animal {
   public  void fly(){

        System.out.println("hamara kuuta udta ye");
    }
}

class car extends Animal {
     private void driving(){

        System.out.println("dummmmmm");
    }
}

 class polymorphism {


    public static  void main(String[] args) {
        // Animal reference, Dog object

            Animal a = new  Animal();

            a.equals(8); // bhag saale

            // Dog reference, Car object
            Dog c = new Dog();
            c.equals(5); // bhag saale (from Animal)


        }
    }
