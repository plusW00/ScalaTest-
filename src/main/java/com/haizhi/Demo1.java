package com.haizhi;


import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

import com.haizhi.utils.StringUtils;


/**
 * @Author wj
 * @Date 2021/11/25
 */
public class Demo1 {
    public static void main(String[] args) {

        String s = "null";
        String s1 = "null";
        String s2 = null;
//        System.out.println(s == s1);
//
        System.out.println("null".equalsIgnoreCase(s2));

        System.out.println(StringUtils.equalsIgnoreCase(s,"null"));

//
//        Date date = new Date();
//        System.out.println(date.toString());
//        long time = date.getTime();
//        System.out.println(time);
//        String format = null;
//        System.out.println(StringUtils.isBlank(format));
//        System.out.println(StringUtils.isNotBlank(format));


//        System.out.println(StringUtils.equalsIgnoreCase(null,format));




       /* int[] i = {1,23};
        System.out.println(Arrays.toString(i));
*/

 /*       Date date = new Date();
        System.out.println(date);

        Timestamp timestamp = new Timestamp(date.getTime());
        System.out.println(timestamp);

//        timestamp.getDate();
        System.out.println(timestamp.getDate());
        Time time = new Time(date.getTime());
        System.out.println(time);

*/

//        double i = 39987.890;
//        long l = (long) i;
//        System.out.println(l);

//        long i1 = Integer.parseInt(i);
//        System.out.println(i1);


//        String s = "12312423513523523413";
//        Integer integer = Integer.valueOf(s);
//        System.out.println(integer);
//


    }
}
