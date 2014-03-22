package com.dj.test.scala.thrift

import com.twitter.finagle.Thrift
import com.twitter.util.{Await, Future}
import com.dj.test.scala.thriftjava.Hello

object ThriftServer {
  def main(args: Array[String]) {
    val server = Thrift.serveIface("localhost:8080", new Hello[Future] {
      def hi() = Future.value("hi")
    })
    Await.ready(server)
  }
}
