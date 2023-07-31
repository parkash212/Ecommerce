package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {".//Features/"}, // here .// representing current project locaion
		// features = {".//Features/Login.feature},
		
		glue="stepDefinitions", // glue is a keyword which specify where exactly our step definition file is present 
		// so Steps.java is part of step definitions , so we can directly specify the package name under step definitions
		
        plugin= { // plugin is used to generate report 
        		"pretty", "html:reports/myreport.html", 
        		"json:reports/myreport.json"
        		},    //Mandatory to capture failures
        
        dryRun=false, // 1:25:00
        monochrome=true,
        tags = "@sanity"	//Scenarios tagged with @sanity,
		
		)
public class TestRunner {
	
// we do not write any thing in test runner class
}
