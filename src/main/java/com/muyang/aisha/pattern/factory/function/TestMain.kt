package com.muyang.aisha.pattern.factory.function

/**
 * Created by chenyixiong on 2018/10/30.
 */
fun main(args: Array<String>) {

    println("工厂方法：")

    val KFCfactory = KFCFactoryImpl()
    println(KFCfactory.makeHamburger()?.getChicken())

    val McDonaldsFactory = McDonaldsFactoryImpl()
    println(McDonaldsFactory.makeHamburger()?.getBeef())
}