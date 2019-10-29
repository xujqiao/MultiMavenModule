package me.jxuao.chap8.aspectdetail85;

public class SmartSeller implements Seller{

    @Override
    public int sell(String goods, String clientName) {
        return 0;
    }

    protected int showGoods(String goods) {
        return 1;
    }
}
