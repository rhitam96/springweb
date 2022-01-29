package springweb;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
@EnableWebMvc
//@Configuration
@EnableWebSecurity
@ComponentScan("springweb")
public class WebConfig implements WebMvcConfigurer{
	public WebConfig() {
		System.out.println("------------------------------------------------------------");
	}
	
//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addRedirectViewController("/*", "/a");
//		System.out.println("======================================");
//	}
	@Bean
	public UserDetailsService userDetailsService() throws Exception{
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User.withDefaultPasswordEncoder().username("admin").password("123456").roles("ADMIN").build());
		return manager;
	}
//	void configure(HttpSecurity http) throws Exception{
//		http.antMatcher("/").authorizeRequests().anyRequest().hasRole("ADMIN").and().httpBasic();
//	}
}
