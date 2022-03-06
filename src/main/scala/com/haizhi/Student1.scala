package com.haizhi

/**
 *
 * @Author wj
 * @Date 2021/12/12 
 */
class Student1 (var name: String, var age: Int) {

//  var name: String = "dabai"
//  var age = 20
//  val ano = 1

  def this() {
    this("无参构造",0)
  }



  def this(age: Int) {
    this("一个参数构造",2)
  }

  def this(name: String) {
    this(name,21)
  }



}


object Main1 {
  def main(args: Array[String]): Unit = {

    var s = new Student1()
    println(s.name)

    var s1 = new Student1("全参构造", 21)
    println(s1.name)

    var s2 = new Student1(22)
    println(s2.name + s2.age)









  }

}