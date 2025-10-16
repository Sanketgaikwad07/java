class Emp{
    private int id;
    private String name;

    //setter method
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    //Getter method
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
class Encapsulation {
    public static void main(String[] args) {
        Emp E=new Emp();
        E.setId(101);
        E.setName("Sanket");
        System.out.println("emp id "+ E.getId());
        System.out.println("emp name: "+ E.getName());
    }
}
