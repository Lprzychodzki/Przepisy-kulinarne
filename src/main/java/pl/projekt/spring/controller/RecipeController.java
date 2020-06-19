package pl.projekt.spring.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RecipeController {

	@RequestMapping(value="/recipe/list")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("recipe-list");
	}
	
	@RequestMapping(value="/recipe/info")
	public ModelAndView info(HttpServletResponse response) throws IOException{
		return new ModelAndView("recipe-info");
	}
	
	@RequestMapping(value="/recipe/add")
	public ModelAndView add(HttpServletResponse response) throws IOException{
		return new ModelAndView("recipe-add");
	}
	
	@RequestMapping(value = "/addPost", method = RequestMethod.POST)
	public ModelAndView processRequest(@ModelAttribute("emp") Recipe emp) {
		List<Recipe> employees = recipeService.getAllEmployees();
		ModelAndView model = new ModelAndView("getRecipe");
		model.addObject("recipe", employees);
		return model;
	}
}
