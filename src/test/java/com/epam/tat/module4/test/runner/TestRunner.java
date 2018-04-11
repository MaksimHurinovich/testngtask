package com.epam.tat.module4.test.runner;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maksim_Hurinovich on 4/11/2018.
 */
public class TestRunner {

    public static void main(String[] args){
        TestNG tng = new TestNG();

        XmlSuite suite = new XmlSuite();
        suite.setName("Calculator");

        List<String> files = new ArrayList<>();
        files.addAll(new ArrayList<String>() {{
            add("./src/test/resources/suites/calculator.xml");
        }});
        suite.setSuiteFiles(files);

        XmlSuite suite2 = new XmlSuite();
        suite2.setName("Parallel");

        List<String> files2 = new ArrayList<>();
        files2.addAll(new ArrayList<String>() {{
            add("./src/test/resources/suites/parallel.xml");
        }});
        suite2.setSuiteFiles(files2);

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);
        suites.add(suite2);

        tng.setXmlSuites(suites);
        tng.run();
    }
}
