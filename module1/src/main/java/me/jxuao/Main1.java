package me.jxuao;

/**
 * @program: MultiMavenModule
 * @description: Module1主类
 * @author: camxu
 * @create: 2019-08-04 15:28
 **/
public class Main1 {

    public static void main(String[] args) {
        Main2.main(args);
    }

    public void test() {
        Main2 m2 = new Main2();
        m2.doPrintln("from main1");
    }

}
