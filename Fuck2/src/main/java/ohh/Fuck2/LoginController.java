package ohh.Fuck2;


//import org.apache.tomcat.jdbc.pool.Validator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {

    @RequestMapping(value="/login")
    public ModelAndView login(){
        return new ModelAndView("login","command",new Login());

    }

    @RequestMapping(value="/calc")
    public ModelAndView Add(){
        return new ModelAndView("calc","command",new Login());

    }

}
