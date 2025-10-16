class Pen {
    String colour;
    String type;

    public void write() {
        System.out.println("Writing something");
    }

    public void printColor() {
        System.out.println("Pen color: " + this.colour);
    }
}
    class Ttudent {
        String name;
        int rollNo;
        double salary;

        public void showInfo() {
            System.out.println(this.name);
            System.out.println(this.rollNo);
            System.out.println(this.salary);
        }
        Ttudent(Ttudent s2){//COPY constructer
this.name=s2.name;
this.rollNo=s2.rollNo;
this.salary=s2.salary;
        }
        Ttudent(){

        }
    }


        class oops {
            public static void main(String[] args) {


                // Student usage
                Ttudent s1 = new Ttudent();
                s1.name="sanket";
                s1.rollNo=34;
                Ttudent s2=new Ttudent(s1);
                s1.showInfo();


            }
        }

