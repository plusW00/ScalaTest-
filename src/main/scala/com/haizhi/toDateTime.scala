package com.haizhi

import java.sql.{Date, Timestamp}

/**
 *
 * @Author wangjia
 * @Date 2022/1/11 
 */
object toDateTime {


  def evaluate2(value: Any, format: String): String = {
    var timestamp: String = null

    try {
      value match {
        case str: String =>
          println("String")
        case l: Long =>
          println("long")
        case _ =>
          println("-")
      }
    } catch {
      case e: Exception =>
        //ignore convert exception todo 待验证
        e.printStackTrace()
    }
    timestamp
  }

  def main(args: Array[String]): Unit = {

    evaluate2("long", null)
    evaluate2(1l, null)

  }

}
