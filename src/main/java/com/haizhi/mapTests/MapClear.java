package com.haizhi.mapTests;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author wangjia
 * @Date 2022/2/9
 */
public class MapClear {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        Map<String, String> map1 = new HashMap();

        map.put("1","1");
        map.put("1","2");
        map.put(")",".");

        System.out.println(map);
        System.out.println(map1);
        if (!map.isEmpty() || !map1.isEmpty()) {
            map.clear();
            map1.clear();
        }

        System.out.println("------");
        System.out.println(map);
        System.out.println(map1);









    }

}
