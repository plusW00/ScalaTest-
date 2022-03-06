package com.haizhi

/**
 *
 * @Author wj
 * @Date 2021/12/12 
 */
class Person {
  // 可修改属性
  var name:String = "hainiu"
  //_表示一个占位符，编译器会根据你变量的具体的类型赋予相应的初始值
  //注意：使用 _ 占位符，变量类型是必须指定的
  //val修饰的变量是不能使用占位符，用var修饰的变量可以使用
  var nickName:String = _

  // 不可修改属性
  val age:Int = 10



}

object Person{
  def main(args: Array[String]): Unit = {
    val p = new Person()
    println(p.age)
    //    p.age = 11
    p.name = "hainiu1"
    println(p.name)
    p.nickName = "大牛"
    println(p.nickName)
    p.nickName = "大大牛"
  }
}

