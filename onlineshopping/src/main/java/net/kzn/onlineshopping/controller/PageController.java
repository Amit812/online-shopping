package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	/*@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index(){
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "welcome to spring web mvc ");
		
		return mv;
		
	}
	*/
	
	/*@RequestMapping(value="/test")
	//public ModelAndView UrlValueTest(@RequestParam("greeting") String greeting){
	public ModelAndView UrlValueTest(@RequestParam(value="greeting",required=false) String greeting){
		
		if(greeting==null){
			greeting="Hello Amina you are default...";
		}
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",greeting);
		
		return mv;
				
	}
	
	*/
	
	
	/*@RequestMapping(value="/test/{greeting}")
	public ModelAndView UrlValueTest(@PathVariable(value="greeting") String greeting){
		
		if(greeting==null){
			greeting="Hello Amina you are default...";
		}
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",greeting);
		
		return mv;
				
	}
	*/
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index(){
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");	
		mv.addObject("userClickHome",true);
		return mv;
		
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView about(){
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");	
		mv.addObject("userClickAbout",true);
		return mv;
		
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact(){
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");	
		mv.addObject("userClickContact",true);
		return mv;
		
	}
	
}
