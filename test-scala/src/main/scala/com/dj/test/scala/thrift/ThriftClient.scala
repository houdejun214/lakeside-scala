package com.dj.test.scala.thrift

import com.dj.test.scala.thriftjava.Hello
import com.twitter.finagle.Thrift
import com.twitter.util.Future

object ThriftClient {
  def main(args: Array[String]) {
    val client = Thrift.newIface[Hello[Future]]("localhost:8080")
    client.hi() onSuccess { response =>
      println("Received response: " + response)
    }
  }
}
