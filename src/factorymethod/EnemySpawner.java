package factorymethod;

public abstract class EnemySpawner {
    public abstract Enemy createEnemy();

    public void spawnAndAttack() {
        Enemy enemy = createEnemy();
        System.out.println("Encounter started:");
        enemy.attack();
    }
}
