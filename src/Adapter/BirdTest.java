package Adapter;

import Main.Bird;
import Main.Felines;
import Main.Nightingale;

public class BirdTest {

    public static void main(String[] args) {
        Bird nightingale = new Nightingale();

        Felines adapter = new BirdAdapter(nightingale);

        System.out.println("Jestem obiektem klasy kot, ale tak naprawdę robię: ");
        adapter.roar();
        adapter.run();

    }
}
