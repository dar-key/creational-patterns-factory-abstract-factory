package abstractfactory;

public class GameSession {
    private final WorldEnemy enemy;
    private final Terrain terrain;

    public GameSession(WorldFactory factory) {
        this.enemy = factory.createEnemy();
        this.terrain = factory.createTerrain();
    }

    public void renderSession() {
        terrain.render();
        enemy.roar();
    }
}
