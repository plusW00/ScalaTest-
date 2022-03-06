package com.haizhi

import scala.util.Random

/**
 *
 * @Author wj
 * @Date 2021/12/8 
 */
object Demo06 {
  def main(args: Array[String]): Unit = {

    val arr = Array("A",1,1.0,true,1L)
    val a: Any = arr(Random.nextInt(arr.length))
    a match {
      case a1:String => println(s"match String ${a1}")
      case a2:Int => println(s"match Int ${a2}")
      case a2:Double => println(s"match Double ${a2}")
      case a2:Boolean => println(s"match Boolean ${a2}")
      case a2:Long => println(s"match Long ${a2}")
      case _:Any => println("other")
    }



  }


}
