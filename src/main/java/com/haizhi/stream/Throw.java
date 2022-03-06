package com.haizhi.stream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author wangjia
 * @Date 2022/1/20
 */
public class Throw {

    public void m1() {
        System.out.println("这是m1");
    }

    public void m2() {
        m1();
        System.out.println("这是m2");
    }




    public static void main(String[] args) throws ParseException {
        Throw t = new Throw();
        t.m2();

//        Date parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2022-01-13 11:37:02.0");
//        System.out.println(parse.toString());


/*
        try {
            int n = 10/0;
            System.out.println(n);
        } catch (Exception e) {
            throw new RuntimeException("a" + e.getMessage());
        }*/

    }

}
