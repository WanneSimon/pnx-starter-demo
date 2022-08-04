package cc.wanforme.nukkit.springDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cc.wanforme.nukkit.spring.NukkitApplicationLauncher;

@SpringBootApplication
public class StarterDemo extends NukkitApplicationLauncher{
	private static final Logger log = LoggerFactory.getLogger(StarterDemo.class);
	
	public static void main(String[] args) {
		log.info("<<<<<<<<<<<<<<<< starting ! >>>>>>>>>>>>>>>");
//		SpringApplication.run(StarterDemo.class, args);
		launchNukkit(StarterDemo.class, args);
		log.info("\n<<<<<<<<<<<<<<<<\tweb server started\t>>>>>>>>>>>>>>>");
	}
	
}
