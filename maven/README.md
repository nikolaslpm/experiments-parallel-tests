# experiments-parallel-tests

Parallel tests applied on Maven.


### Maven Commands

##### Running a Test Suite

It only works when using surefire version 2.21 because Surefire 2.22.x is the first version 
with auto-detection of the JUnit platform, i.e. as soon as junit-platform-engine is on the classpath 
it will attempt to execute all test classes using the JUnit Platform. 

However, the JUnit Platform cannot execute suites annotated with @RunWith(JUnitPlatform.class). 

More info at: [https://github.com/junit-team/junit5/issues/1778](https://github.com/junit-team/junit5/issues/1778)

- Running specific test:

`mvn -Dtest=RunAllDummyTests -DfailIfNoTests=false test`

- Running multiple Test Suites filtering by package name:

`mvn -Dtest=**/testsuite/** -DfailIfNoTests=false test`

--------

##### Running a Test
- Running a specific test filtering by package name:  

`mvn -Dtest=dummy/* test`

- Running a specific test filtering by class name:  

`mvn -Dtest=dummy/Dummy2Test test`