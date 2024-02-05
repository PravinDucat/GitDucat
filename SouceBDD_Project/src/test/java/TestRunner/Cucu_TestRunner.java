package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/Features/"},
glue= {"StepDefination"},
plugin= {"pretty", "html:target/Pravin.html"})
		

		
		
public class Cucu_TestRunner extends AbstractTestNGCucumberTests{

}
