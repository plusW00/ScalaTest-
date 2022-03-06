package com.haizhi

import java.util.Base64

/**
 *
 * @Author wangjia
 * @Date 2022/1/10 
 */
object EnCodeBase64File {

  def main(args: Array[String]): Unit = {

    val filePath: String = "/Users/haizhi/wj/cdh514_kerberos/krb5.conf"
    val fileContent = FileUtils.readFile2Byte(filePath)
    val str = Base64.getEncoder.encodeToString(fileContent)
    println(str)
    println("----------")

    val filePath01: String = "/Users/haizhi/wj/cdh514_kerberos/user.keytab"
    val fileContent1 = FileUtils.readFile2Byte(filePath01)
    val str1 = Base64.getEncoder.encodeToString(fileContent1)
    println(str1)

    println("----------")

    val str3 = Base64.getDecoder.decode(str1)
    String.valueOf(str1)
    val str2 = new String(str3, 0, str3.length)
    println(str2)

  }

}
