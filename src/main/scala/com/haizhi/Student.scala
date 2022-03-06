package com.haizhi

/**
 * Scala语言的面向对象 练习之：类的构造器+apply方法
 * 定义一个Student类
 * 有name、sex等属性（使用主构造器定义）
 * 获取对象的方式有以下两种方式：
 * var s=new Student(“张三”,”男”)
 * var s1=new Student(“lisi”)  可以少传参数，使用辅助构造器
 * var s2=Student(“小红”,”女”)  省略new,使用apply方法
 *
 * @Author wj
 * @Date 2021/12/12 
 */
class Student (var name:String, val sex:String) {

  //辅助构造器
  def this(name: String) {
    //调用主构造器
    this(name, "unknown")
    println("调用辅助构造器")

  }

}

object Student {

  //使用apply方法
  def apply(name: String,sex: String)={
    println("利用object中的apply方法")
    new Student(name,sex)
  }

  def main(args: Array[String]): Unit = {
    var s=new Student("张三","男")
    println(s.name + ":" + s.sex)

    var s1=new Student("lisi")
    println(s1.name + ":" + s1.sex)

    var s2=Student("小红","女")
    println(s2.name + ":" + s2.sex)

  }

}

