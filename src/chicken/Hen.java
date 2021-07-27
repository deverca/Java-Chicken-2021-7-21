package chicken;

public class Hen extends ChickenInfo{


    public Hen(double price) {
        super(price);
    }

    @Override
    public int getTotalChickens() {
        return (int) Math.floor( 100/price);
    }
}
