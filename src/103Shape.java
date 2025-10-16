


class titanic{
    public void area (){
        System.out.println("Displaying area");
    }
}

class triangle extends titanic{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
    
}
class egm extends triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }

}
class circle extends triangle{
    public void area(int r){
        System.out.println((3.14)*r*r);

    }
}


class Shape {
    public static void main(String[] args) {

    }
}
