package demo;


import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
// TODO: 4) Annotate class to mark web integration test, with randomPort set to true
public class ApplicationTests {


	// TODO: 5) Autowire local.server.port with @Value

	@Test
	public void runAndTestHttpEndpoint() {

		// TODO: 6) test "/" endpoint with an integration test
	}

}
