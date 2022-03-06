package com.haizhi

import scala.util.Random

/**
 *
 * @Author wj
 * @Date 2021/12/7 
 */
object Demo05 {
  def main(args: Array[String]): Unit = {
    var arr = Array("A","B","C","D")
    val a = arr(Random.nextInt(arr.length))
    println(a)

    a match {
      case "A" => println("a")
      case "B" => println("b")
      case "C" => println("c")
      case "D" => println("d")
      case _ => println("other")
    }
  }

}
