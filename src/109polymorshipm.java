
class parent{
    String name;
    int age;
    public void func(){
        System.out.println("Its a parent funcation: "+ name);
    }
    //overloading  method(compiler time)
    public void func(int a){
        System.out.println("PARENT funcation: j"+ age);
    }
}
//child
class child extends parent{
    @Override //overring methdd
    public void func( int a){
        System.out.println("child funcation : "+ name);
    }
}
class polymorshipm {
    public static void main(String[] args) {
        parent p=new parent();
        child c=new child();
        parent pc=new child();

        p.func();
        p.func(20);
        c.func(10);
        pc.func(59);
        pc.age=23;
        pc.name="sanket";
    }
}
