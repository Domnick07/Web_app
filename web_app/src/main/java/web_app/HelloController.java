package web_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController 
{
	@RequestMapping("/hello")
	public String display()
	{
		return "viewpage";
	}
	@RequestMapping("/logout")
	public String show()
	{
		return "finalpage";
	}

}
