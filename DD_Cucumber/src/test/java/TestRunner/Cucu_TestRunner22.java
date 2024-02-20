package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/Features/"},
glue= {"DD_stepdef"},
plugin= {"pretty", "html:target/Pravin.html"})
		

		
		
public class Cucu_TestRunner22 extends AbstractTestNGCucumberTests{

}
