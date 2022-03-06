package com.haizhi.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author wangjia
 * @Date 2022/1/16
 */
public class TestPrintWriter {
//若是输出文本数据，建议使用打印流。PrintWriter还可以指定输出文本使用何种字符集、在构造参数中指定是否自动刷新。如果不想覆盖原来的数据，使用该类的append()方法，就会在文件尾部添加内容。

    public static void main(String[] args) throws IOException {

        File f = new File("D:\\reviewIO\\PW.java");
        PrintWriter pw = new PrintWriter(f);
        //把指定内容打印至数据源中
        pw.println("AAAAAAAAA");
        pw.println("BBBBBBBBB");
        pw.println("CCCCCCCCC");
        pw.flush();
        System.out.println("使用PrintWriter写入数据完成");
        System.out.println("==========读取写入的数据==========");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String s = null;
        StringBuilder sb = new StringBuilder();//一个可变字符串
        while ((s = br.readLine()) != null) {
            sb.append(s); //把读取的字符串组合起来
        }
        System.out.println(sb);
        br.close();
        pw.close();

    }

}
