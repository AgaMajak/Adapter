package Main;

public class Test {
    public static void main(String[] args) {

        Bird nightingale = new Nightingale();
        Felines lion = new Lion();

        System.out.println("Słowik śpiewa:");
        nightingale.sing();
        System.out.println("Lew ryczy:");
        lion.roar();
    }
}
