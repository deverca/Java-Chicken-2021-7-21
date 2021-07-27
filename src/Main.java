import chicken.Chick;
import chicken.Cock;
import chicken.Hen;

public class Main {

    public static void main(String[] args) {
        Cock cock = new Cock(5.00);
        Hen hen = new Hen(3.00);
        Chick chick = new Chick(0.03);
        System.out.println("If One cock sells 5 yuan, one hen 3 yuan, and one yuan for three chickens. If you want to buy 100 of them with 100 yuan," +
                "how many cocks, chicken, and hen can you get?\n Possible answers: ");
        chick.buyChicken(cock.getTotalChickens(), hen.getTotalChickens(),chick.getTotalChickens(),100.00,100);

    }


}
