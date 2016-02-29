package com.binyu.xia.pattern.build.factory;

import junit.framework.TestCase;

/**
 * Created by hadexs on 16/2/29.
 */
public class SimpleFactoryTest extends TestCase {

    public void testSimpleFactoryMain() throws Exception {
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.simpleFactoryMain();
    }
}