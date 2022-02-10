package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * 
 * Bootstrapping class
 *
 *	1. spring boot application의 Boot strapping 
 *	2. 설정 클래로 역할(Configuration class)
 */

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		/**
		 * 	1. Application Context(Spring Container)생성
		 * 	2. Web Application type인지 확인 (web application이면 starter가 있겠지!?) 
		 * 		Web Application 이라고 판단이 되는 경우 MVC or Reactive 타입인지 결정  
		 * 	3. Annotation scanning(auto) (-@ComponentScan) or Configuration Class (-@Import)(Explicit)을 통합 빈 생성/등록 및 와이어링
		 * 	4. Web Application(MVC)  
		 * 		- 내장(embeded) 서버(TomcatEmbeddedServletContainer) 인스턴스 생성 
		 * 		- 서버 인스턴스에 web application 배포 
		 * 	5. ApplicationRunner interface를 구현한 bean을 찾아서 실행(run호출)
		 * 
		 */
//		ConfigurableApplicationContext c = null;
//		try {
//			c = SpringApplication.run(HelloWorldApplication.class, args);
//			
//		}catch(Throwable ex){
//			ex.printStackTrace();
//		}finally {
//			c.close();	
//		}
		
//		try ~ with ~ resource
		try(ConfigurableApplicationContext c = SpringApplication.run(HelloWorldApplication.class, args);){
			
		}
		
	}

}
