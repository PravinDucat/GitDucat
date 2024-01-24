package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
CucumberOptions(Tag="", Features={"src/test/resources/Features/SouceDemo.feature"},
glue={"stepDefination"},
plugin= {"pretty","html:Target/SouceReport.html"})
		
		
	

	
//	@CucumberOptions(
//			features = "/BDDFrameworkCucumber/Features/SouceDemo.feature", //the path of the feature files
//			glue={"stepDefination"}, //the path of the step definition files
//			plugin= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
//			monochrome = true, //display the console output in a proper readable format
//			//strict = true, //it will check if any step is not defined in step definition file
//			dryRun = true //to check the mapping is proper between feature file and step def file
//			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
//			)
//	//C:\Users\pc\eclipse-workspaceNEW2\BDDFrameworkCucumber\Features\Login.feature

public class TestRunner extends AbstractTestNGCucumberTests
{

}
