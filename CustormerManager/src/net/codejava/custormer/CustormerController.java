package net.codejava.custormer;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustormerController {
	@Autowired
	private CustormerService service;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("index");
		List<Custormer> list = service.listall();
		modelAndView.addObject("list",list);
		return modelAndView;
	}
	@RequestMapping("/new")
	public String NewCustormer(Map<String, Object> model) {
		model.put("custormer",new Custormer());
		return "new_custormer";
	}
	@RequestMapping(value = "/save" , method = RequestMethod.POST)
	public String SaveCustormer(@ModelAttribute("custormer") Custormer custormer) {
		service.Save(custormer);
		return "redirect:/";
	}
	@RequestMapping("/edit")
	public ModelAndView EditCustormer(@RequestParam long id) {
		ModelAndView modelAndView = new ModelAndView("edit_custormer");
		Custormer custormer = service.get(id);
		modelAndView.addObject("custormer", custormer);
		return modelAndView;
	}
	@RequestMapping("/delete")
	public String Delete(@RequestParam long id) {
		service.delete(id);
		return "redirect:/";
	}
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam String keyword) {
		ModelAndView modelAndView = new ModelAndView("search");
		List<Custormer> list = service.search(keyword);
		modelAndView.addObject("list", list);
		return modelAndView;
	}
	
}
