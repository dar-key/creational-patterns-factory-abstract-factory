package abstractfactory;

public class IceWorldFactory implements WorldFactory {
    @Override
    public WorldEnemy createEnemy() {
        return new IceGolem();
    }

    @Override
    public Terrain createTerrain() {
        return new SnowTerrain();
    }
}
