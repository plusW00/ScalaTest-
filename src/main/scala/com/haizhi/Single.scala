package com.haizhi
import scala.collection.mutable.ArrayBuffer
/**
 *
 * @Author wj
 * @Date 2021/12/7 
 */

object Single{
  def main(args: Array[String]): Unit = {
    val factory = SingleFactory
    println(factory.getSession)
    println(factory.getSession.size)
    println(factory.getSession(0))
    println(factory.removeSession)
    println(factory.getSession.size)
  }
}


object SingleFactory {
  /**
   * 相当于java中的静态块
   */
  println("SingleFactory Init")
  var i = 5
  private val session = ArrayBuffer[A]()
  while(i > 0){
    session += new A()
    i -= 1
  }

  def getSession = session

  def removeSession:Unit ={
    val s = session(0)
    session.remove(0)
    println(s"session被移除$s")
  }

}

class A{}
