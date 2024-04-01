package steps;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@CucumberOptions(name ="\'login\'",plugin = {"pretty","html:src/main/resources/demo.html"} , monochrome= true, features="src\\test\\java\\features", glue = "steps")
@RunWith(Cucumber.class)

public class SFDCrunner {
		
}
