package com.haizhi.stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Author wangjia
 * @Date 2022/1/16
 */
public class TestCloseStream {

    //Java类库中有许多资源需要通过close方法进行关闭。

    //比如 InputStream、OutputStream，数据库连接对象 Connection，MyBatis中的 SqlSession 会话等。作为开发人员经常会忽略掉资源的关闭方法，导致内存泄漏。

    static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }

    static void copy(String src, String dst) throws Exception {
        InputStream is = new FileInputStream(src);
        try {
            OutputStream os = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[100];
                int n;
                while ((n = is.read()) >= 0) {
                    os.write(buf, n, 0);
                }
            } finally {
                os.close();
            }
        } finally {
            is.close();
        }
    }


    static String firstLineOfFileAutoClose(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }


    //最好使用这种方法进行流的操作
    static void copyAutoClose(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
             OutputStream os = new FileOutputStream(dst)) {
            byte[] buf = new byte[1000];
            int n;
            while ((n = in.read(buf)) >= 0) {
                os.write(buf, 0, n);
            }
        }
    }


}
