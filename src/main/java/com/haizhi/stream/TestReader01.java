package com.haizhi.stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @Author wangjia
 * @Date 2022/1/16
 */
public class TestReader01 {
    public static void main(String[] args) throws IOException {


        InputStream input = new FileInputStream("/Users/haizhi/name.txt");
        InputStreamReader inr = new InputStreamReader(input, "utf-8");
        BufferedReader read = new BufferedReader(inr);
        String line = "";
        while (line != null) {
            line = read.readLine();
        }


    }
}
