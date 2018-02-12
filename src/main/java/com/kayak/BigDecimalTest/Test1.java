package com.kayak.BigDecimalTest;

import java.math.BigDecimal;

import static javax.swing.text.html.HTML.Tag.HEAD;

/**
 * Created by asus on 2018/2/11.
 */
public class Test1 {

    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal(10);
        BigDecimal bd2 = new BigDecimal("3");
        System.out.println(bd1);
        System.out.println(bd2);
        bd1 = bd1.divide(bd2,3,BigDecimal.ROUND_HALF_EVEN);
        System.out.println(String.format("after db1:%s",bd1.toString()));
        System.out.println(bd1.compareTo(bd2));
        System.out.println("ssss");
        System.out.println("bbbbb");
    }

}
