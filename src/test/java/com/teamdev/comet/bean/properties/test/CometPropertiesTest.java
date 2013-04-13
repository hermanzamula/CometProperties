package com.teamdev.comet.bean.properties.test;


import com.teamdev.comet.bean.properties.CometParameters;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static junit.framework.Assert.assertTrue;

public class CometPropertiesTest{
    OutputStream testStream;
    BufferedReader etaloneFileReader;
    BufferedReader testFileReader;
    String etaloneDatabaseName = "database.fasta";


    CometParameters cometProperties = new CometParameters();

    @Before
    public void init() {
        try {
            etaloneFileReader = new BufferedReader(new InputStreamReader(new FileInputStream("etalone-comet-file")));
            ObjectInputStream stream = new ObjectInputStream(new FileInputStream("etalone-comet-file"));

            testStream = new FileOutputStream("test-comet-file");
            testFileReader = new BufferedReader( new InputStreamReader(new FileInputStream("test-comet-file")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    @Test
    public void testProperDataSetToOutputStream() {
        try {
            cometProperties.setDatabaseName(etaloneDatabaseName);
            cometProperties.setToStream(testStream);
            assertTrue(getEtaloneContent().equals(getTestContent()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getEtaloneContent() throws IOException {
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = etaloneFileReader.readLine()) != null) {
            sb.append(line);
        }
        return  sb.toString();
    }

    private String getTestContent() throws  IOException {
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = testFileReader.readLine()) != null) {
            sb.append(line);
        }
        return  sb.toString();
    }
}
