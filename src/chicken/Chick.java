package chicken;

public class Chick extends ChickenInfo{


    public Chick(double price) {
        super(price);
    }

    @Override
    public int getTotalChickens() {
        return (int) Math.floor( 100/price);
    }
}
