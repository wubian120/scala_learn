object Chapter1 {

  def main(args: Array[String]): Unit={


    val greeting: String = "hello"

    var l= 1.to(10)

    val answer = 8*5+1
    println(greeting)
    println(answer)
    println(1.to(10))

    println(1.toString())

    val a = "hello"
    println(a(1))

    var t1 = "Bonjour".sorted.apply(3)

    println(t1)

    println("Scala".sorted)
    println("end")
  }
}
