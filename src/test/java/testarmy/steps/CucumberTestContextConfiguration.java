package testarmy.steps;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;
import testarmy.TestConfig;

@CucumberContextConfiguration
@ContextConfiguration(classes = TestConfig.class)
public class CucumberTestContextConfiguration {

}
