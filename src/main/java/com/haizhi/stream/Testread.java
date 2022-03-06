package com.haizhi.stream;

/**
 * @Author wangjia
 * @Date 2022/1/16
 */

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * read() :  从输入流中读取数据的下一个字节，返回0到255范围内的int字节值。如果因为已经到达流末尾而没有可用的字节，则返回-1。在输入数据可用、检测到流末尾或者抛出异常前，此方法一直阻塞。
 * read(byte[] b) :  从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。以整数形式返回实际读取的字节数。在输入数据可用、检测到文件末尾或者抛出异常前，此方法一直阻塞。
 *
 * read():功能：读取单个字符的个数，如果已经读完的话会返回-1 (其范围从 0 到 65535 )
 *readLine(): 功能：读取一个文本行。
 * 使用字符流读取文件内容：如果是文本文件，则使用字符流效率更高
 */
public class Testread {


    public static void getRead(File file) throws IOException {
//创建文件缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        byte[] buf = new byte[1024];//创建字节数组，存储临时读取的数据
        int len = 0;//记录数据读取的长度
        //循环读取数据
        while((len = bis.read(buf)) != -1) { //长度为-1则读取完毕
            System.out.println(new String(buf,0,len));
        }
        bis.close(); //关闭流
    }


    public static void getReadLine(String path) throws IOException {
        File f = new File(path);
        if (f.exists()) { // 判断文件或目录是否存在
            if (f.isFile()) {
                BufferedReader br = new BufferedReader(new FileReader(path));//该缓冲流有一个readLine()独有方法
                String s = null;
                while ((s = br.readLine()) != null) {//readLine()每次读取一行
                    System.out.println(s);
                }
            }
        }
    }

}
