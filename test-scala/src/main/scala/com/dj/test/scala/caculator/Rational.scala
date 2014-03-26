package com.dj.test.scala.caculator

class Rational(n: Int, d: Int) {
	require(d != 0)
	val numer:Int= n
	val denom:Int= d
  def this(n:Int) = this(n,1)
  
  def add(that: Rational) = {
	new Rational(n*that.denom + that.numer*d, d*that.denom)
  };

  def add(n1: Int, d1: Int) = {

  };
  
  def +(that:Rational):Rational = this add that
  
  def +(i:Int):Rational = new Rational(numer + i*denom,denom);
  
  override def toString = n + "/" + d;
}

object Rational extends App {
  
  implicit def intToRational(x:Int) =new Rational(x)
   
  val r = new Rational(1,2)
  
  println(r)
  
  val r1 = new Rational(1,1)
  println (r1 add r)
  
  println (r1 + r)
  
  println (r1 + 2)
  
  println (r1 + 1)
  
  println (3 + r)
}