package testClasses;

import java.util.List;

import org.testng.TestNG;
import org.testng.collections.Lists;

public class TestngMain {

	public static void main(String[] args) {

		 TestNG testng = new TestNG();
		    List<String> suites = Lists.newArrayList();
		    suites.add(".//testSelenium.xml");
		    testng.setTestSuites(suites);
		    testng.run();

	}

}
