package com.dj.test.scala

import java.io.File

object IteratorTest extends App {
	var here = new File(".");
	for(file <- here.listFiles()
		if(file.getName().startsWith("."))
	) println(file)
}