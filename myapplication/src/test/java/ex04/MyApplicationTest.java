package ex04;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ex04.component.MyComponent;

// @ExtendWith(SpringExtension.class)
// @ContextConfiguration(classes= {MyApplication.class})
// @Configuration 설정 클래스는 자동(스캐닝)으로 찾지 못 함 
@SpringBootTest
public class MyApplicationTest {
	
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}
