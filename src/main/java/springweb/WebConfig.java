package springweb;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//@EnableWebMvc
//@Configuration
@EnableWebSecurity
@ComponentScan("springweb")
public class WebConfig implements WebMvcConfigurer{
//public class WebConfig extends WebSecurityConfigurerAdapter{
	public WebConfig() {
		System.out.println("------------------------------------------------------------");
	}
	
//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addRedirectViewController("/*", "/a");
//		System.out.println("======================================");
//	}
	@Bean
	public UserDetailsService userDetailsService(){
		System.out.println("userDetailsService bean");
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User.builder().username("admin").password((new BCryptPasswordEncoder()).encode("1234")).roles("ADMIN").build());
		manager.createUser(User.builder().username("user").password((new BCryptPasswordEncoder()).encode("123")).roles("USER").build());
		return manager;
	}
//	@Override
	protected void configure(HttpSecurity http) throws Exception{
		System.out.println("----------------------fdsfs");
//		http  
//		.authorizeRequests()  
//		.anyRequest().authenticated()  
//		.and()  
//		.formLogin()  
//		.and()  
//		.httpBasic();  

        http                                
        .authorizeRequests()
        .antMatchers("/user").hasRole("USER")
        .antMatchers("/admin").hasRole("ADMIN")
		.and()
		.formLogin() 
        .and()  
        .httpBasic();  
//		http.authorizeRequests().antMatchers("/").hasRole("ADMIN").anyRequest().authenticated().and().httpBasic();
//		.and().anyRequest().authenticated()
//		.antMatchers("/admin").hasRole("ADMIN");
	}
}
