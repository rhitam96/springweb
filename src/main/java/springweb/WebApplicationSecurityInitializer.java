package springweb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebApplicationSecurityInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	public void main() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				WebApplicationSecurityInitializer.class);
		System.out.print("************************************************"+applicationContext.getBeanDefinitionNames().length);
		for (String beanName : applicationContext.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] { WebConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
//		main();
		return new String[] { "/", "/a" };
	}

}
