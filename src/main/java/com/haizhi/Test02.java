package com.haizhi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;

/**
 * @Author wj
 * @Date 2021/12/14
 */
public class Test02 {
//double转换
    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));

        String key5confName = System.getProperty("user.dir") + "/Jdbc.conf";
        String keytabName = System.getProperty("user.dir") + "/jdbc.keytab";
        String jaasConfName = System.getProperty("user.dir") + "/jaas.conf";

        FileOutputStream os = new FileOutputStream(key5confName);
        String s = "niahaoa,wodoubuzhdiao aganai";
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);

        for (byte aByte : bytes) {
            System.out.println(aByte);
        }

        os.write(bytes);
        os.flush();
        os.close();

      /*
        // 生成 krb5.conf,user.keytab, jaas.conf文件
        PrintWriter writer = null;
//        PrintWriter writer1 = null;
//        PrintWriter writer2 = null;
        try {


            writer = new PrintWriter(keytabName, "UTF-8");
            writer.println("keytabContent");

            writer = new PrintWriter(jaasConfName, "UTF-8");
            writer.println("com.sun.security.jgss.krb5.initiate {");
            writer.println("    useKeyTab=true");
            writer.println("    doNotPrompt=true;");


            writer = new PrintWriter(key5confName, "UTF-8");
            writer.println("krb5Content");
        } finally {
            if (writer != null) writer.close();
//            if (writer1 != null) writer1.close();
//            if (writer2 != null) writer2.close();

        }
*/
/*

        long memory = 32768899;
//        double i = (double)memory / 1024.0

        final double transformValue = 1024.00D;
        double i = (double) memory / transformValue;
        System.out.println(new BigDecimal(i).setScale(2, RoundingMode.HALF_UP).doubleValue());

//        double bd = new BigDecimal(i).setScale(2, RoundingMode.HALF_UP).doubleValue();
//        bd = bd.setScale(2, RoundingMode.HALF_UP);
*/


    }

}
