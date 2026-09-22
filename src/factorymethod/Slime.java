package factorymethod;

public class Slime implements Enemy {
    @Override
    public void attack() {
        System.out.println("Slime spits acidic sludge.");
    }
}
