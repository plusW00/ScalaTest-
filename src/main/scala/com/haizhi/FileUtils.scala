package com.haizhi

/**
 *
 * @Author wangjia
 * @Date 2022/1/10 
 */
object FileUtils {


  def readFile2String(path: String): String = {
    //导入Scala的IO包
    import scala.io.Source
    //以指定的UTF-8字符集读取文件，第一个参数可以是字符串或者是java.io.File
    val source = Source.fromFile(path, "UTF-8")
    //或取文件中所有行
    val lines = source.getLines()
    val sb = new StringBuilder()
    lines.foreach(line => {
      sb.append(line)
    })
    //将所有行放到数组中
    source.close()
    sb.toString()
  }

  def readFile2Byte(path: String): Array[Byte] = {
    import java.io.FileInputStream
    val is = new FileInputStream(path)
    val buffer = new Array[Byte](is.available())
    is.read(buffer)
    is.close()
    buffer
  }


}
