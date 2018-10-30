package com.muyang.aisha.pattern.factory

/**
 * Created by chenyixiong on 2018/10/30.
 */
class KFC:Hamburger {
    override fun getBeef(): String {
        return "肯德基---牛肉汉堡"
    }

    override fun getChicken(): String {
        return "肯德基---鸡肉汉堡"
    }
}