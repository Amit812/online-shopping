package net.kzn.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

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
	
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index(){
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");	
		mv.addObject("userClickHome",true);
		
		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		
		
		
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
	
	
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts(){
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");	
		mv.addObject("userClickAllProducts",true);
		
		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		
		return mv;
		
	}
	
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProduct(@PathVariable("id") int id){
		
		ModelAndView mv = new ModelAndView("page");
		
		//categoryDAO to fetch a single category
		Category category = null;
		category = categoryDAO.get(id);
		
		mv.addObject("title",category.getName());
		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		//passing the single category object
		mv.addObject("category",category);
			
		mv.addObject("userClickCategoryProducts",true);
		
		
		return mv;
		
	}
	
	
	
	
}
