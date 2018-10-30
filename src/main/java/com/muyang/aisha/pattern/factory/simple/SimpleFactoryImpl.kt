package com.muyang.aisha.pattern.factory.simple

import com.muyang.aisha.pattern.factory.Hamburger
import com.muyang.aisha.pattern.factory.KFC
import com.muyang.aisha.pattern.factory.McDonalds

/**
 * Created by chenyixiong on 2018/10/30.
 */
class SimpleFactoryImpl : SimpleFactory {
    override fun makeHamburger(name: String): Hamburger? {
        return when (name) {
            "McDonalds" -> McDonalds()
            "KFC" -> KFC()
            else -> null
        }
    }
}