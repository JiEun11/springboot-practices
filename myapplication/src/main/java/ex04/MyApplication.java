package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 	@SpringBootApplication : meta annotation
 * 	얘네를 포함함.	
 * 	+ @SpringBootConfiguration (cf. @Configuration)
	+ @ComponentScan
	+ @EnableAutoConfiguration (웹 MVC설정:view resolver,meesage convertor, security, jpa, aop etc 자동 default 설정 on Dependency)
 *
 */

//@Configuration
@SpringBootApplication
public class MyApplication {
	
	public static void main(String[] args) {
		try (ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args);) {

		}

	}

}
