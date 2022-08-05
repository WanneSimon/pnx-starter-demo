package cc.wanforme.nukkit.springDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DashConfig {

	@Bean("dash1")
	public DashInfo dash1() {
		return new DashInfo(1, "rabbit");
	}
	
	@Bean("dash2")
	public DashInfo dash2() {
		return new DashInfo(2, "fox");
	}
	
}
