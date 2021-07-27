package chicken;

public abstract class ChickenInfo {
    public double price;

    public abstract int getTotalChickens();

    public ChickenInfo(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void buyChicken(int cockTotal, int henTotal, int chickTotal, double price, int amount) {
        for (cockTotal = 20; cockTotal > 0; cockTotal--) {
            for (henTotal = 33; henTotal > 0; henTotal--) {
                for (chickTotal = 300; chickTotal > 0; chickTotal--) {
                    if ((cockTotal * 5 + henTotal * 3 + chickTotal / 3) == 100 && (cockTotal + henTotal + chickTotal == 100)) {

                        System.out.println("Answer: You'll have " + cockTotal + " cocks, " + henTotal + " hens, and " + chickTotal + " chicks.");
                    }
                }
            }
        }


    }
}


