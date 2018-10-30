package com.muyang.aisha.pattern.factory.abstract

import com.muyang.aisha.pattern.factory.Hamburger

/**
 * Created by chenyixiong on 2018/10/30.
 */
abstract class AbsFactory {

    abstract fun getKFC(): Hamburger

    abstract fun getMcDonalds(): Hamburger
}