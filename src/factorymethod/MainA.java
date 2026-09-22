package factorymethod;

public class MainA {
    public static void main(String[] args) {
        EnemySpawner spawner;

        spawner = new GoblinSpawner();
        spawner.spawnAndAttack();

        spawner = new SkeletonSpawner();
        spawner.spawnAndAttack();

        spawner = new SlimeSpawner();
        spawner.spawnAndAttack();
    }
}
