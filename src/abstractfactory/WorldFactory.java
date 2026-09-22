package abstractfactory;

public interface WorldFactory {
    WorldEnemy createEnemy();
    Terrain createTerrain();
}
