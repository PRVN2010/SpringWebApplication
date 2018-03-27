package com.praveen.controller;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.praveen.model.UserModel;
import com.praveen.service.User;


@Controller
public class RegistrationController {
	
	//@Autowired
	//User user;
	@Autowired
	//Employee employee;
	User user;
	
	@RequestMapping(value="/register",method=RequestMethod.GET )
	public String registerHome(@RequestParam Map<String, String> map, Model model){
		for(Entry<String, String> entry : map.entrySet()){
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		System.out.println("GET is executed.");
		//System.out.println(employee.getAddress().getAddress());
		model.addAttribute("register", new UserModel());
		return "register";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST )
	public String registerUser(@ModelAttribute("register") UserModel model, BindingResult bindingResult,
				ModelMap map, RedirectAttributes attributes){
		
		System.out.println("POST is executed.");
		System.out.println("Id: "+model.getUserId()+" Name: "+model.getUserName()+" City: "+model.getCity());
		try{
			user.save(model);
			attributes.addFlashAttribute("success",true);
			attributes.addFlashAttribute("user", model);//there will be added as model attributes.
			attributes.addAttribute("key","value");
			return "redirect:register.do";
		}catch (Exception e) {
			map.addAttribute("errorMsg", e.getCause().getMessage());
			map.addAttribute("register", model);
			return "register";
		}
	}

}
