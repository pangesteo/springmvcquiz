package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	
	@Autowired
	private CsrService service;

		//hendler methods...
		@RequestMapping("/")
		public String viewHomePage(Model model) {
			List<Csr> listCsr = service.listAll();
			model.addAttribute("listCsr", listCsr);
			
			return "index";
		}
		
		@RequestMapping("/new")
		public String showNewCsrPage(Model model) {
			Csr csr = new Csr();
			model.addAttribute("csr", csr);
			
			return "new_Csr";
		}
		
		@RequestMapping(value = "/update", method = RequestMethod.POST) 
		public String updateCsr(@ModelAttribute("csr") Csr csr) {
			service.save(csr);
			
			return "redirect:/";
		}
		
		@RequestMapping(value = "/save", method = RequestMethod.POST)
		public String saveCsr(@ModelAttribute("csr") Csr csr) {
			service.save(csr);
			
			return "redirect:/";
		}
		
		@RequestMapping("/edit/{id}")
		public ModelAndView showEditCsrPage(@PathVariable(name="id") int id) {
			ModelAndView mav = new ModelAndView("edit_Csr");
			Csr csr = service.get(id);
			mav.addObject("csr", csr);
			
			return mav;
		}
		
		@RequestMapping("/delete/{id}")
		public String deleteCsr(@PathVariable(name = "id") int id) {
			service.delete(id);
			return"redirect:/";
		}
		

	}
