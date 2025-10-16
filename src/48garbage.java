abstract class animal {
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

class pil extends animal {
    @Override
    public void animalSound() {
        System.out.println("bobobob bobbo obnboobob obob obbo");
    }

    public void joj() {
        System.out.println("Please can you enter the whole number");
    }
}

 class main {
    public static void main(String[] args) {
        pil p = new pil();

        p.animalSound();
        p.sleep();
        p.joj();
    }
}
