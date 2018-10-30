package com.muyang.aisha.pattern.factory.function

import com.muyang.aisha.pattern.factory.Hamburger

/**
 * Created by chenyixiong on 2018/10/30.
 */
interface IFactory {

    fun makeHamburger(): Hamburger?

}