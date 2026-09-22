package abstractfactory;

public class GrassTerrain implements Terrain {
    @Override
    public void render() {
        System.out.println("Displaying forest grass and dense trees.");
    }
}
