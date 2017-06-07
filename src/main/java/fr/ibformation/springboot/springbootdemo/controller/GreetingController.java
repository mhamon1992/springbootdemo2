package fr.ibformation.springboot.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class GreetingController {

	// gretting en return va chercher dans les templates le greeting et il va attribué les paramètres
	
    @RequestMapping("/greeting")
    public ModelAndView greeting(){
    	ModelAndView mav = new ModelAndView();
    	mav.setViewName("greetting");
    	mav.addObject("name","qsd");

    	
        return mav;
    }
    
}
