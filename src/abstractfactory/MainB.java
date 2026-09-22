package abstractfactory;

public class MainB {
    public static void main(String[] args) {
        String worldType = "ICE";

        WorldFactory factory;
        if ("ICE".equalsIgnoreCase(worldType)) {
            factory = new IceWorldFactory();
        } else {
            factory = new ForestWorldFactory();
        }

        GameSession session = new GameSession(factory);
        session.renderSession();
    }
}
