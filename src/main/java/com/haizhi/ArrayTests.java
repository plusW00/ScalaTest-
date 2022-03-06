package com.haizhi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Author wangjia
 * @Date 2022/2/14
 */
public class ArrayTests {

    public static void main(String[] args) throws IOException {

//        String [] s = {"123", "153", "222"};
//
//        String s1 = Arrays.toString(s);
//
//        System.out.println(s1.substring(1, s1.length() - 1));
//

        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(new String[]{"/bin/bash", "-c", "which flink"});

        try (BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line.trim());
            }
            br.close();
            int cmdResult = process.waitFor();
            System.out.println(cmdResult);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}