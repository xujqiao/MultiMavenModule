package me.jxuao.springbootdemo.pojo;

/**
 * @program: MultiMavenModule
 * @description: 让人误会的Car类
 * @author: camxu
 * @create: 2019-08-27 23:32
 **/
public class MisunderstandedCar {
    private String iDCard;

    public MisunderstandedCar() {
    }

    public String getiDCard() {
        return iDCard;
    }

    public void setiDCard(String iDCard) {
        this.iDCard = iDCard;
    }

    @Override
    public String toString() {
        return "MisunderstandedCar{" +
                "iDCard='" + iDCard + '\'' +
                '}';
    }
}
