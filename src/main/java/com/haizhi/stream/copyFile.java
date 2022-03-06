package com.haizhi.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Author wangjia
 * @Date 2022/1/16
 */
public class copyFile {

    public static String copyFile() throws IOException, ClassNotFoundException {
        String src = "/Users/haizhi/name.txt";
        String dest = "/Users/haizhi/out.txt";

        File srcFile = new File(src);//源文件数据源
        File desFile = new File(dest);//写入到目标数据源
        //数据源不存在
        if(!srcFile.exists() || !desFile.exists()) {
            throw new ClassNotFoundException("源文件或者拷贝目标文件地址不存在！");
        }
        //非文件类型
        if(!srcFile.isFile() || !desFile.isFile()) {
            return "源文件或者目标文件不是文件类型!";
        }
        InputStream is = null;
        OutputStream os = null;
        byte[] buf = new byte[Byte.MAX_VALUE];//缓存区
        int len = 0;//读取长度
        try {
            is = new BufferedInputStream(new FileInputStream(srcFile));//读取数据源
            os = new BufferedOutputStream(new FileOutputStream(desFile));//写入到数据源
            while((len = is.read(buf)) != -1) { //读取长度不为-1，继续读取
                os.write(buf); //读取内容之后马上写入目标数据源
            }
            os.flush();//输出
            return "文件拷贝成功！查看拷贝文件路径：" + desFile.getPath();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(is != null)
                is.close();
            if(os != null)
                os.close();
        }
        return "文件拷贝失败";
    }

}
