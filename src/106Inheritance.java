class animal{
    String colour;
    void eat(){

        System.out.println("Animal is eating: ");

    }
    void sleep(){
        int age;
        System.out.println("Animal is sleeping: ");
    }
}
//subclass(child)
class dog extends animal{

    }

class Inheritance {
    public static void main(String[] args) {
        dog a = new dog();
        a.sleep();
    a.sleep();
    }
}
