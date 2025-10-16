class encapsulation {

    private String name;

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setname(String newname) {
        this.name = newname;
    }


    public static void main(String[] args) {


        encapsulation en = new encapsulation();
            en.setname("sanket");

            System.out.println("name="+en.getName());


        }
    }



