package springweb;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class TestController {
	TestController(){
		System.out.println("------------initialized----------");
//		RequestMappingHandlerMapping hm = new RequestMappingHandlerMapping();
//		for(HandlerMethod m:hm.getHandlerMethods().values()) {
//			System.out.println(m.getMethod().getName());
//		}
		
	}
//	@RequestMapping("/")
	@ResponseBody
	@RequestMapping(value="/a", method=RequestMethod.GET)  
	public String response() {
		System.out.println("****************************");
		return "Response";
	}
	
	@ResponseBody
	@RequestMapping(value="/user", method=RequestMethod.GET)  
	public String userResponse() {
		System.out.println("*************user***************");
		return "User Response";
	}

	@ResponseBody
	@RequestMapping(value="/admin", method=RequestMethod.GET)  
	public String adminResponse() {
		System.out.println("************admin****************");
		return "Admin Response";
	}
	@ResponseBody
    @RequestMapping(value="/logout",method = RequestMethod.GET)
    public String logout(HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        httpSession.invalidate();
        System.out.println("logout");
        return "logout";
    }
}
