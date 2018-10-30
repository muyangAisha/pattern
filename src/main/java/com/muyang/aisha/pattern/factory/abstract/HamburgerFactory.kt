package com.muyang.aisha.pattern.factory.abstract

import com.muyang.aisha.pattern.factory.Hamburger
import com.muyang.aisha.pattern.factory.KFC
import com.muyang.aisha.pattern.factory.McDonalds

/**
 * Created by chenyixiong on 2018/10/30.
 */
class HamburgerFactory : AbsFactory() {
    override fun getKFC(): Hamburger {
        return KFC()
    }

    override fun getMcDonalds(): Hamburger {
        return McDonalds()
    }
}