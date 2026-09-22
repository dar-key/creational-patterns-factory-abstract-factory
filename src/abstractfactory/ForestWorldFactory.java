package abstractfactory;

public class ForestWorldFactory implements WorldFactory {
    @Override
    public WorldEnemy createEnemy() {
        return new ForestWolf();
    }

    @Override
    public Terrain createTerrain() {
        return new GrassTerrain();
    }
}
