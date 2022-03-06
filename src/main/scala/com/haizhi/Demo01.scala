package com.haizhi

object Demo01 {
  def main(args: Array[String]): Unit = {
    //1.数组
    //数组定义
    val arr01 = new Array[String](2)
    val ints = Array[Int](2,1,2,3)
    val arr02 = Array("1","2")
    //数组打印   Array没有覆盖toString()方法，因此直接打印会打印出地址
    //          可以将Array转成ArrayBuffer进行打印。
    //          Array是不可变数组，ArrayBuffer是可变数组
    print(arr02.toBuffer)
    print(ints.toBuffer)
    //2.





  }
}
