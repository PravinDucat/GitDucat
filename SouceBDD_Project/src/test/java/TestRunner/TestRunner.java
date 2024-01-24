package TestRunner;



CucumberOptions(Tag="", Features={"/src/test/resources/Features/SouceDemo.feature"},
glue={"stepDefination"},
plugin= {"pretty","html:Target/SouceReport.html"})
public class TestRunner extends AbstractTestNGCucumberTests   {
	
}
