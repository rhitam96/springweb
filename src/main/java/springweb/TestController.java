package springweb;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
@Controller
public class TestController {
	TestController(){
		System.out.println("------------initialized----------");
	}
	@RequestMapping("/a")
	@ResponseBody
	public String response() {
		System.out.println("****************************");
		return "Response";
	}

}
