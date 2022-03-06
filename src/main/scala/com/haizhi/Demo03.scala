package com.haizhi

/**
 *
 * @Author wj
 * @Date 2021/12/6 
 */
object Demo03 {
  def main(args: Array[String]): Unit = {
    //1.数组
    val arr = new Array[String](3)
    val arr1 = Array[String]("1","2")
    arr1.foreach(a => println(a))
    for(a <- arr1) println(a)
    //注意设置带初始值的定长数组不能用new，因为是调用Array的静态对象，这个静态对象可以传递多个参数而new的是调用类的构造方法只能接受一个参数就是数组的长度。
    println(arr.toBuffer + "," + arr1.toBuffer)
    //2.链表
     val words:List[Int] = List(1,2,3,4,5)
     words.foreach(word=>println(word))
    //3. 集合
    val s:Set[Int] = Set(1,2,3)
    s.foreach(si=>println(si))
    //4.map
    var m:Map[String,String]=Map("a"->"aa","b"->"bb")
    m.foreach(mi=>println(mi))
    //如果要向Map中增加元素：

    m +=("c"->"cc") //并且前面定义变量m时不能用val m形式，只能用var m形式
    //5.元组： 用小括号包含的多个值或多个键值对
    //scala中元组中元素是不可变的，最多只能有22元组可双容纳不同的元素对象。元组中元素虽然不可变，但元素是对象时对象的内容是可以变动的



  }





}
