package srqsoftware.eric.controllers
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
class EricController {
	
	@RequestMapping("/")
	public ModelAndView index( Locale locale ) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "index" );

		return modelAndView;
	}
	
}