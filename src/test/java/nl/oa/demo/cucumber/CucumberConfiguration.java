package nl.oa.demo.cucumber;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "nl.oa.demo.cucumber.service")
public class CucumberConfiguration {

}
