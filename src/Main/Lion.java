package Main;

public class Lion implements Felines {
    @Override
    public void roar() {
        System.out.println("Woooarrr!");
    }

    @Override
    public void run() {
        System.out.println("*bieganie*");
    }
}
