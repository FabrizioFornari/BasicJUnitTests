package org.unicam.test;


import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("JUnit 4 Suite Demo")
//@SelectPackages("org.unicam.test")
@SelectClasses({HelloWorldTest.class , MyClassTest.class})
public class Suite1 {
}


