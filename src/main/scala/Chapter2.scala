object Chapter2 {


  def main(args: Array[String]): Unit = {
    println("hello Chapter 2")

    var x = -100
    val value = if (x > 0) 1 else -1
    x = 101
    val x1 = if (x > 0) 1

    println(x1)

    println(value)

    println("-------")
    for (i <- 1 to 10) {
      println(i)
    }
    println("----1---")

    for (i <- 1 to 3; j <- 1 to 3) print(f"${10 * i +j}%3d")


  }
}
