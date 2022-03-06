package com.haizhi

/**
 *
 * @Author wj
 * @Date 2021/12/12 
 */
class Con private(var name:String = "初始化", var age:Int = 10) {
  println("初始化主构造器")





}


object Con {


  def apply(name: String, age: Int): Con = {
    new Con(name, age)
  }

  def main(args: Array[String]): Unit = {
    var c1 = new Con()
    println(c1.name + c1.age)

    var c2 = new Con("", 12)

    var c3 = new Con("aaa")
    println(c3.name)


  }


}