package my.project;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Search box test suite")
@SelectClasses({ActionSimulator.class, MainPageSearchBoxTest.class})
public class TestSuite {
}
