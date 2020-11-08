package Adapter;

import Main.Bird;
import Main.Felines;

public class BirdAdapter implements Felines {
    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void roar() {
        bird.sing();
    }

    @Override
    public void run() {
        bird.fly();
    }
}
