package com.geekcap.vmturbo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Niranjan on 1/24/18.
 */
public class ThingTest {

    @Test
    public void testN() {
        Thing t = new Thing();
        t.setN(5);
        Assert.assertEquals("N should be 5", 5, t.getN());
    }
}
