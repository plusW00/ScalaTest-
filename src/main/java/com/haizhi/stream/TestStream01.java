package com.haizhi.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

/**
 * @Author wangjia
 * @Date 2022/1/16
 */


/**
 * 流：
 * 字节流：new FileInputStream()
 * BufferedInputStream()是对fileInputStream的包装，可以提供一个缓冲区
 */
public class TestStream01 {

    public static void main(String[] args) throws IOException {

        FileInputStream input = null;
        FileOutputStream out = null;
        FileInputStream fileInputStream = null;

        try {

            //下面两种构造器本质上也是一样的，前者是后者的特殊形态。
            //1.
            File file = new File("/Users/haizhi/name.txt");
            fileInputStream = new FileInputStream(file);
            //2.
            input = new FileInputStream("/Users/haizhi/name.txt");

            /**
             * 当然，你也会发现这个方法的返回值是使用的整型类型「int」来接收的，为什么不用「byte」？
             * 首先，read 方法返回的值一定是一个八位的二进制，而一个八位的二进制可以取值的值区间为：「0000 0000，1111 1111」，也就是范围 [-128,127]。
             * read 方法同时又规定当读取到文件的末尾，即文件没有下一个字节供读取了，将返回值 -1 。所以如果使用 byte 作为返回值类型，那么当方法返回一个 -1 ，我们该判定这是文件中数据内容，还是流的末尾呢？
             * 而 int 类型占四个字节，高位的三个字节全部为 0，我们只使用它的最低位字节，当遇到流结尾标志时，返回四个字节表示的 -1（32 个 1），这就自然的和表示数据的值 -1（24 个 0 + 8 个 1）区别开来了。
             * */

            //这个 read 方法的作用，它用于返回流中下一个字节，返回 -1 说明读取到文件末尾，已无字节可读。
//        fileInputStream.read();

        /*打印出我们 name.txt 文件中的内容和实际读出的字节数：
        为了能够完整的读出文件中的内容，一种解决办法是：将 buffer 定义的足够大，以期望尽可能的能够存储下文件中的所有内容。
        这种方法显然是不可取的，因为我们根本不可能实现知道待读文件的实际大小，一味的创建过大的字节数组其本身也是一种很差劲的方案。
        */
        /*byte[] buffer = new byte[1024];
        int len = input.read(buffer);
        String str = new String(buffer);
        System.out.println(str);
        System.out.println(len);
        input.close();*/
            /*第二种办法：它可以动态调整内部字节数组的大小，保证适当的容量
             * */

            out = new FileOutputStream("/Users/haizhi/out.txt");


            int len;
            while ((len = input.read()) != -1) {
                out.write(len);
                System.out.println(len);
            }

        } finally {

            //这样写有问题，如果第一行流关闭的时候发生了异常，那么就会导致后面两个流不会被关闭
            if (input != null) input.close();
            if (out != null) input.close();
            if (fileInputStream != null) input.close();

        }


    }


}
