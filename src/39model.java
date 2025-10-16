class model {
   int  modelyear;
    String modelName;

    public model(String modelName){
       this(modelName,1909);

    }
public model(String modelName,int modelyear){
        this.modelName=modelName;
        this.modelyear=modelyear;
}
public  void printinfo(){
    System.out.println(modelName+" "+modelyear);
}

    public static void main(String[] args) {
        model car1=new model("BMW");
        model car2=new model("nano");
        model car3=new model("punch");
        model car4 =new model("mustang",1998);
        model car7=new model("fraari", 2029);
        car1.printinfo();
        car2.printinfo();
        car3.printinfo();
        car4.printinfo();
        car7.printinfo();
        car1.printinfo();
    }
}
