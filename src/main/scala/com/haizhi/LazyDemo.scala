package com.haizhi

/**
 *
 * @Author wj
 * @Date 2021/12/7 
 */
object LazyDemo {
  def init():Unit = {
    println("init")
  }
  def main(args: Array[String]): Unit = {
    val property = init()       //没有lzay关键字的时候
    println("init after")
    println(property)
  }
}
