package com.muyang.aisha.pattern.factory.function

import com.muyang.aisha.pattern.factory.Hamburger
import com.muyang.aisha.pattern.factory.KFC

/**
 * Created by chenyixiong on 2018/10/30.
 */
class KFCFactoryImpl : IFactory {

    override fun makeHamburger(): Hamburger? {
        return KFC()
    }
}