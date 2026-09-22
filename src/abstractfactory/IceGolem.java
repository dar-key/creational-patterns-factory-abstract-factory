package abstractfactory;

public class IceGolem implements WorldEnemy {
    @Override
    public void roar() {
        System.out.println("Ice Golem crashes through the ice.");
    }
}
