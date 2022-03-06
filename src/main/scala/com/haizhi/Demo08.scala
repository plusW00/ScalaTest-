package com.haizhi

import com.sun.xml.internal.rngom.parse.host.Base

import java.util.Base64
import scala.util.Random

/**
 *
 * @Author wj
 * @Date 2021/12/30 
 */
object Demo08 {
  def main(args: Array[String]): Unit = {
  /*  val arr = Array("A",1,1.0,true,1L)
    val a: Any = arr(Random.nextInt(arr.length))
    a match {
      case a1:String => println(s"match String ${a1}")
      case a2:Int => println(s"match Int ${a2}")
      case a2:Double => println(s"match Double ${a2}")
      case a2:Boolean => println(s"match Boolean ${a2}")
      case a2:Long => println(s"match Long ${a2}")
      case _:Any => println("other")
    }*/

    val filePath: String = "/Users/haizhi/wj/cdh514_kerberos/krb5.conf"

    val fileContent = FileUtils.readFile2Byte(filePath)
    val str = Base64.getEncoder.encodeToString(fileContent)





  }

}
