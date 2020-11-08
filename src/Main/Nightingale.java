package Main;

public class Nightingale implements Bird {
    @Override
    public void fly() {
        System.out.println("*fruwanie*");
    }

    @Override
    public void sing() {
        System.out.println("Ćwir ćwir");
    }
}
