package com.muyang.aisha.pattern.factory

/**
 * Created by chenyixiong on 2018/10/30.
 */
class McDonalds : Hamburger {

    override fun getBeef(): String {
        return "麦当劳---牛肉汉堡"
    }

    override fun getChicken(): String {
        return "麦当劳---鸡肉汉堡"
    }
}