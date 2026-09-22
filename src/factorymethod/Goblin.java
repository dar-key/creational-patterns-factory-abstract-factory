package factorymethod;

public class Goblin implements Enemy {
    @Override
    public void attack() {
        System.out.println("Goblin stabs with a dagger.");
    }
}
