package pl.flaghunter.harau.sandbox;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("main");
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
	}
}
