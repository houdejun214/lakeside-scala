package com.dj.test.scala

import java.io.PrintWriter
import java.io.File


/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
    
//    val writer = new PrintWriter(new File("test.txt" ))
//    writer.write("Hello Scala")
//  	writer.close()
  }
}
