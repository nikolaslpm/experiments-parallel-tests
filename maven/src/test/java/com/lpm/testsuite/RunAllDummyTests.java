package com.lpm.testsuite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.lpm.dummy")
@IncludeClassNamePatterns(".*Test")
public class RunAllDummyTests {
}
