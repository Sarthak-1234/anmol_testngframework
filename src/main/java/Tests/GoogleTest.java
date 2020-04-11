package Tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import InitiateTest.Init;
import Objects.GooglePageObject;

//@Listeners(Reporting.Listener.class)
public class GoogleTest extends Init{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GoogleTest.class);
	
	
	@Test
	public void testing() {
		//FunctionsCalling + Assertions
		//kahi ddriver use nh ikarunga
		
		googlepage.getTitle();
	}

}


