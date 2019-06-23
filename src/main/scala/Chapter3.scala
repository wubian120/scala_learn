import scala.collection.mutable.ArrayBuffer

object Chapter3 {

  def main(args: Array[String]): Unit={

    val nums = new Array[Int](10)
    val s = Array("Hello","World")
    for(i <- 0 until s.length){
      println(s(i))
    }
    s(0) = "goodBye"
    println("--------")
    for(i <- 0 until s.length){
      println(s(i))
    }

    //变长 数组

    val b = ArrayBuffer

  }
}
