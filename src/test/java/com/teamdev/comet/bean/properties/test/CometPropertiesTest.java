package com.teamdev.comet.bean.properties.test;


import com.teamdev.comet.bean.properties.CometProperties;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

public class CometPropertiesTest{
    OutputStream  stream;

    CometProperties cometProperties = new CometProperties();

    @Before
    public void init() {
        try {
            stream = new FileOutputStream("test");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAssert() {

        try {
            cometProperties.setToStream(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
