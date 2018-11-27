package org.unicam.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        MyClassTest.class,
        HelloWorldTest.class })


//@RunWith(JUnitPlatform.class)
//@SelectClasses( {MyClassTest.class,
//				HelloWorldTest.class })
public class JUnit5TestSuiteExample {

}
