package com.ale;

import org.testng.xml.Parser;
import org.testng.xml.XmlSuite;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.List;

public class HelloMaven {

    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) throws IOException {

//        HelloMaven hm = new HelloMaven();
//        int res = hm.add(2, 3);
//        System.out.println(res);
//        String res = System.getProperty("testEnvironment");
//        System.out.println(res);
        Path path = FileSystems.getDefault().getPath("test.xml").normalize();
        Parser parser = new Parser(path.toString());
        List<XmlSuite> suites = (List<XmlSuite>) parser.parse();
        XmlSuite rootSuite = suites.get(0);
        String FileName = rootSuite.getParameter("configurationFile");
        System.out.println(FileName);
    }
}
