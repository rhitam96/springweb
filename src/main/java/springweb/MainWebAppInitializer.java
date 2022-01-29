//package springweb;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.ContextLoaderListener;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.context.support.GenericWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//
//public class MainWebAppInitializer implements WebApplicationInitializer {
//    @Override
//    public void onStartup( ServletContext sc) throws ServletException {
//
//        AnnotationConfigWebApplicationContext context = 
//          new AnnotationConfigWebApplicationContext();
//        
//        context.register(WebConfig.class);
////        root.setConfigLocation("springweb");
//        sc.addListener(new ContextLoaderListener(context));
//        
//        ServletRegistration.Dynamic dispatcher = 
//          sc.addServlet("sp", new DispatcherServlet(context));
//        dispatcher.setLoadOnStartup(1);
//        dispatcher.addMapping("/");
//    }
//}