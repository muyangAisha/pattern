package com.muyang.aisha.pattern.factory.abstract

/**
 * Created by chenyixiong on 2018/10/30.
 */
fun main(args: Array<String>) {
    println("抽象工厂：")

    val factory = HamburgerFactory()
    println(factory.getKFC().getBeef())
    println(factory.getMcDonalds().getChicken())
}