package com.haizhi.listTests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author wangjia
 * @Date 2022/2/10
 */
public class ListTests {

    public static void main(String[] args) {

        List listStudent = new ArrayList<Student>();
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"wang");
        map.put(2,"wang1");
        map.put(3,"wang2");

        map.entrySet().stream().forEach(entry -> {
            Student student = new Student();
            student.setAge(entry.getKey());
            student.setName(entry.getValue());
            listStudent.add(student);
        });


        System.out.println(listStudent);


    }


}
