package context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kh.vo.Greeting;

//해당 클래스가 스프링 설정을 위한 설정 정보를 제공하는 클래스 
@Configuration
public class AppContext {
	
	//Spring IoC container에 객체를 Bean으로 등록함
	//Bean 아이디값은 메서드명으로 지정
	@Bean
	public Greeting greeter() {
		return new Greeting(1000, "홍길동");
	}
}





