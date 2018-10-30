package com.muyang.aisha.pattern.factory.function

import com.muyang.aisha.pattern.factory.Hamburger
import com.muyang.aisha.pattern.factory.McDonalds

/**
 * Created by chenyixiong on 2018/10/30.
 */
class McDonaldsFactoryImpl : IFactory {
    override fun makeHamburger(): Hamburger? {
        return McDonalds()
    }
}