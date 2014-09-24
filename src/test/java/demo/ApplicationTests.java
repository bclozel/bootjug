package demo;


import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
// TODO: 4) Annotate class to mark integration test, with "server.port=0"
public class ApplicationTests {


	// TODO: 5) Autowire local.server.port

	@Test
	public void runAndTestHttpEndpoint() {

		// TODO: 6) test "/" endpoint with an integration test
	}

}
