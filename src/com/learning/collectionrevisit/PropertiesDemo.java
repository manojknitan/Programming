package com.learning.collectionRevisit;

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("./properties/db.properties");
        Properties prop = new Properties();

        prop.load(fr);

        //System.out.println(prop.getProperty("uname"));
        //System.out.println(prop.getProperty("pass"));
        //System.out.println(prop.getProperty("db"));

        Properties p = System.getProperties();
        Set set = p.entrySet();

        Iterator itr = set.iterator();
        while (itr.hasNext())
        {
            Map.Entry entry = (Map.Entry)itr.next();
            //System.out.println(entry.getKey()+"===="+entry.getValue());
        }

        //to set/create property file
        Properties properties = new Properties();

        properties.setProperty("environment","dev");
        properties.setProperty("os","windows10");

        properties.store(new FileWriter("./properties/info.properties"),"prop example");
    }
}
