package com.muyang.aisha.pattern.factory.simple

import com.muyang.aisha.pattern.factory.Hamburger

/**
 * Created by chenyixiong on 2018/10/30.
 */
interface SimpleFactory {
    fun makeHamburger(name: String): Hamburger?
}

