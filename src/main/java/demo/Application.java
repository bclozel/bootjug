package demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

	// TODO: 1) Read Application class
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


	// TODO: 19) Add Health custom health check
}
