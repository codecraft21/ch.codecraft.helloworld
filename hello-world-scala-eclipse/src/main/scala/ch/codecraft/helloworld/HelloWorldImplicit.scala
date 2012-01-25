package ch.codecraft.helloworld

object HelloWorldImplicit {

  case class A(a: String);
  case class B(b: String);

  implicit def bFromA(a: A) = new B(a.a);

}