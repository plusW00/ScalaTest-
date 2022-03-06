package com.haizhi

/**
 *
 * @Author wj
 * @Date 2021/12/8 
 */


object Demo07{

  def m1(name:String):String = {
    name match {
      case "a" => {
        println("A")
        "a1"
      }
      case "b" => {
        println("B")
        "b1"
      }
      case _ => {
        println("other")
        "z1"
      }
    }
  }


  def m2:PartialFunction[String,String] = {
    case "a" => {
      println("A")
      "a1"
    }
    case "b" => {
      println("B")
      "b1"
    }
  }

  def f:PartialFunction[Any,Any] = {
    //当用偏函数匹配不上的时候不会报错，而普通的模式匹配是会报错的
    case a:Int => a * 10
    case b:String => b
  }

  def main(args: Array[String]): Unit = {
    val arr = Array("a","b","c")
    println(arr.map(m1).toBuffer)
    println(arr.collect(m2).toBuffer)

    val arr1:Array[Any] = Array(1,2,3,4,"海牛",1.0)
    println(arr1.collect(f).toBuffer)

    val arr2 = Array(1,2,3)
    (arr2 collect {
      case a:Int => a * 10
    }).foreach(println)

    println(arr2.map({case a:Int => a * 10}).toBuffer)
    //这里要注意，当匿名偏函数代替函数的时候匹配不上是会报错
    println((arr1 map {case a:Int => a * 10 case b:String => b}).toBuffer)

  }

}