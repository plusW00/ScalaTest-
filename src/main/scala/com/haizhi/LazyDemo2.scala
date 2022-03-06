package com.haizhi

/**
 *
 * @Author wj
 * @Date 2021/12/7 
 */
object LazyDemo2 {
  def init():Unit = {
    println("init")
  }
  def main(args: Array[String]): Unit = {
    lazy val property = init()        //有lzay关键字的时候，在调用的时候才去初化它
    println("init after")
    println(property)
  }

}
