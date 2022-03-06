package com.haizhi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.haizhi.utils.StringUtils;

/**
 * @Author wangjia
 * @Date 2022/1/11
 */
public class test03 {

    public static void main(String[] args) throws ParseException {
//        String name = "naw".getClass().getName();
//        System.out.println(name);


//        System.out.println(Double.valueOf("12342").longValue());
//
//        System.out.println(Long.valueOf("123".toString()));


        System.out.println(StringUtils.isNotBlank(null));

        Date parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("1642050363");
        System.out.println(parse);





    }

}
