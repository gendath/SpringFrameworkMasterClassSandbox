package guru.springframework.sfgdi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"guru.springframework.sfgdi", "com.springframework.pets"})
@SpringBootTest
class SfgDiApplicationTests {

	@Test
	void contextLoads() {
	}

}
