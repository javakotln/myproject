package com.teno

fun main() {
//    println("Hello kotlin")
//    Human().hello()  //在kotlon裡面,呼叫建構子不需要new

    //儲存物件
    val h = Human()  //val(Value)不能改變它的值
    h.hello()
}

class Human{
    fun hello(){
        println("Hello World")
    }
}
