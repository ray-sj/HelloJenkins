package Demo.Test;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format={"pretty", "html:target/cucumber"},
				features="src/resources",
				glue="stepdefs")

public class AllDemoTests {

}

