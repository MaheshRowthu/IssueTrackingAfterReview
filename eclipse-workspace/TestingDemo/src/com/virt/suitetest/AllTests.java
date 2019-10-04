package com.virt.suitetest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ut.test.StringMoverTest;
import com.ut.test.StringMoverTestPara;

@RunWith(Suite.class)
@SuiteClasses({StringMoverTest.class,StringMoverTestPara.class})
public class AllTests {

}
