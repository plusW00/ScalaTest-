package com.haizhi

/**
 *
 * @Author wj
 * @Date 2021/12/7 
 */

//构造器
class ConTest(var name:String, val sex:String, age:Int) {
//  println("初始化主构造器")
//
//  def print_info = age

}

object ConTest1{
  def main(args: Array[String]): Unit = {
    var c = new ConTest("幺妹", "女", 10)
    println(c.name)
    println(c.sex)
//        println(c.age)
//    println(c.print_info)
    println("---------------")
    c.name = "幺妹啊"
    //    c.sex = "女"
  }
}

// 伴生对象
object ConTest{
  def main(args: Array[String]): Unit = {
    var c = new ConTest("娇虎","女", 10)
    println(c.name)
    println(c.sex)
    //    println(c.age)
//    println(c.print_info)
    println("---------------")
    c.name = "娇虎啊"
    //    c.sex = "女"
  }
}
