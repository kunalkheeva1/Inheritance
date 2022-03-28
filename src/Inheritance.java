interface Kunal {
    default void kk() {
        System.out.println("kheeva");
    }
}   interface Kheeva{
        default void kk(){
            System.out.println("paji");

        }

    }
class Inheritance implements Kunal, Kheeva{
    public void kk(){
        Kunal.super.kk();
        Kheeva.super.kk();
    }

    public static void main(String[] args) {
        Inheritance nn = new Inheritance();
        nn.kk();
    }
}





