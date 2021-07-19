package com.CucumberSuite.TetSuite.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigRead {

    public static Properties readConfigProperties(String filename) throws Exception{
        filename = filename.trim();

        Properties configProperties = new Properties();
        InputStream inputStream = new FileInputStream(filename);
        configProperties.load(inputStream);
        return configProperties;
    }
}
