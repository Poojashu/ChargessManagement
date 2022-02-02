package sprint1.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChargesApp {

	public static void main(String[] args) {
		SpringApplication.run(ChargesApp.class, args);
		System.out.println("Charges Module Started...");
	}
}