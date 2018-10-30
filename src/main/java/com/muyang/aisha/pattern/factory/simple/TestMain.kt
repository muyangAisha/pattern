package com.muyang.aisha.pattern.factory.simple

/**
 * Created by chenyixiong on 2018/10/30.
 */
fun main(args: Array<String>) {
    val factory = SimpleFactoryImpl()

    println("简单工厂：")
    println(factory.makeHamburger("KFC")?.getBeef())
    println(factory.makeHamburger("McDonalds")?.getChicken())
}