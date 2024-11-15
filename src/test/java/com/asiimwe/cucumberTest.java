package com.asiimwe;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses(cucumberTest.class)
public class cucumberTest {
    // This class will run the feature files with the specified step definitions
}
