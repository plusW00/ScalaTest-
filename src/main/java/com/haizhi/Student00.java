package com.haizhi;

/**
 * @Author wj
 * @Date 2021/12/12
 */
public class Student00 {

    private String name;
    private int age;

    Student00() {

    }


    Student00(String name, int age) {
        this.name = name;
        this.age = age;

    }


    public static void main(String[] args) {

        Student00 s = new Student00();
        s.age = 1;
        Student00 s1 = new Student00("", 1);

        System.out.println(s.age);



    }



}
