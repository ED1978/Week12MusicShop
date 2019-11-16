package money.coins;

import money.IPay;
import money.Money;

public class Coin extends Money {

    public Coin(CoinType coinType){
        super(coinType, "Metal");
    }

}
