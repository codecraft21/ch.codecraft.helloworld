package ch.codecraft.helloworld

import ch.codecraft.helloworld.HelloWorldImplicit._

object HelloWorld extends App {

  println("hi!")

  val a: A = new A("a")
  val b: B = a

  println(b.b)
}
