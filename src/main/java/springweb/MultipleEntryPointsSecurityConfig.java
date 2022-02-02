//package springweb;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.AuthenticationEntryPoint;
//import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//@EnableWebMvc
//@Configuration
////@EnableWebSecurity
//@ComponentScan("springweb")
////@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class MultipleEntryPointsSecurityConfig {
//	@Bean
//	public UserDetailsService userDetailsService() throws Exception{
//		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//		manager.createUser(User.withUsername("user1").password(encoder().encode("1234")).roles("USER").build());
//		
//		manager.createUser(User.withUsername("user2").password(encoder().encode("12345")).roles("ADMIN").build());
//		return manager;
//		
//	}
//	@Bean
//	public PasswordEncoder encoder() {
//		return new BCryptPasswordEncoder();
//	}
//	@Configuration
////	@ComponentScan("springweb")
//	@EnableWebSecurity
//	@Order(1)
//	public static class Config1 extends WebSecurityConfigurerAdapter{
//		@Override
//		public void configure(HttpSecurity http) throws Exception{
//			http.antMatcher("/user/*").authorizeRequests().anyRequest().hasRole("USER").and().httpBasic().authenticationEntryPoint(authenticationEntryPoint());
//		}
//		@Bean
//		public AuthenticationEntryPoint authenticationEntryPoint() {
//			BasicAuthenticationEntryPoint entryPoint = new BasicAuthenticationEntryPoint();
//			entryPoint.setRealmName("u");
//			return entryPoint;
//		}
//	}
//	@Configuration
//	@EnableWebSecurity
//	@Order(2)
//	public static class Config2 extends WebSecurityConfigurerAdapter{
//		@Override
//		public void configure(HttpSecurity http) throws Exception{
//			http.antMatcher("/admin/*").authorizeRequests().anyRequest().hasRole("ADMIN").and().httpBasic().authenticationEntryPoint(authenticationEntryPoint1());
//		}
//		@Bean
//		public AuthenticationEntryPoint authenticationEntryPoint1() {
//			BasicAuthenticationEntryPoint entryPoint = new BasicAuthenticationEntryPoint();
//			entryPoint.setRealmName("a");
//			return entryPoint;
//		}
//	}
//	
//}
