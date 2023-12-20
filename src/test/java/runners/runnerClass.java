package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src//test//resources//features",
		glue= {"stepDefs"},
		monochrome=true,
		plugin= {"pretty", "html:target//reports/htmlrepor.html"}
		
		
		
		)


public class runnerClass extends AbstractTestNGCucumberTests{

}
