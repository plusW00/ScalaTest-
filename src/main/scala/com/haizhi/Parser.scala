package com.haizhi
import scala.io.Source
import scala.collection.mutable

/**
 *
 * @Author wj
 * @Date 2021/12/7 
 */


//类
class Parser(){
  // 实例方法，解析ip
  def parse(ip:String)  = {
    println("parse " + ip)
    val addr = Parser.map.getOrElse(ip, "未知主机名")
    addr
  }

}
//伴生对象 ：与类名相同且用object修饰的对象叫伴生对象，类和伴生对象之间可以互相访问对方的私有方法和属性
object Parser{

  private val path:String = "C:\\Users\\My\\Desktop\\ip.txt"

  var map = new mutable.HashMap[String, String]()

  // 静态方法加载文件
  def loadFile() = {
    println("load file:" + path)
    val list: List[Array[String]] = Source.fromFile(path).getLines().toList.map(_.split(" "))
    for(arr:Array[String] <- list) {
      val ip = arr(0)
      val hostname = arr(1)
      map += (ip -> hostname)
    }

  }
}

object ParserTest{
  def main(args: Array[String]): Unit = {
    Parser.loadFile()
    val p = new Parser()

    println(p.parse("192.168.88.196"))
  }
}


