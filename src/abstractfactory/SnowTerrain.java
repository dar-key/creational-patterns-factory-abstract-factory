package abstractfactory;

public class SnowTerrain implements Terrain {
    @Override
    public void render() {
        System.out.println("Displaying deep snow and frozen ground.");
    }
}
