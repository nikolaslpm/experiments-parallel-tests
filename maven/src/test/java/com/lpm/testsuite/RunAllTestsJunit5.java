package com.lpm.testsuite;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

//This class doesn't find any tests for some reason
@Suite
@SuiteDisplayName("JUnit Platform Suite Demo")
@SelectPackages("com.lpm")
@IncludeClassNamePatterns(".*Test")
public class RunAllTestsJunit5 {
}
