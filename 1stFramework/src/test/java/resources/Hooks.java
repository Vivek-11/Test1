package resources;

import java.io.File;
import java.io.IOException;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends DriverInitialization {
	public static File directory = new File(".");
	
	@Before
    public void beforeScenario() throws IOException{
        System.out.println("This will run before the Scenario");
        driverSetup();
    }	
	
	@After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
        tearDown();
    }
	
}
