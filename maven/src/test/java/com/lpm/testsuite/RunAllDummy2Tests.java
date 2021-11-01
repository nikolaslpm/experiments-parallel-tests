package com.lpm.testsuite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeClassNamePatterns;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.lpm")
@IncludeClassNamePatterns(".*Dummy2Test")
@ExcludeClassNamePatterns(".*Another.*")
public class RunAllDummy2Tests {
}
