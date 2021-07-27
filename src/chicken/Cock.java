package chicken;

public class Cock  extends ChickenInfo{


    public Cock(double price) {
        super(price);
    }

    @Override
    public int getTotalChickens() {
        return (int) Math.floor( 100/price);
    }
}
