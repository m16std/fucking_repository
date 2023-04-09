package ohh.Fuck2;

import java.util.Arrays;
import org.joda.time.LocalTime;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Fuck2Application {

	public static void main(String[] args) {
		SpringApplication.run(Fuck2Application.class, args);
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
	}


}