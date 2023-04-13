package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping("/gugu.do")
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView("jsp/result");
		//구구단을 공유
		String data="";
		for (int i = 1; i <=9; i++) {
			data = data + (9+"*"+i+"="+(9*i))+"<br/>";
		}
		mav.addObject("gugu", data);
		return mav;
	}
}
