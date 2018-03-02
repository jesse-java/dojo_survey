package com.naldojesse.dojosurvey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import javax.servlet.http.HttpSession;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMethod;

@SessionAttributes({"name", "location", "language", "comment"})
@Controller
@SpringBootApplication
public class DojosurveyApplication {

	public static void main(String[] args) { SpringApplication.run(DojosurveyApplication.class, args);}

//	@ModelAttribute("user")
//	public User setUpUser() {
//		return
//	}

	@RequestMapping("/")
	public String index()  {
		return "index.jsp";
	}


	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam(value="name") String name, @RequestParam(value="location") String location, @RequestParam(value="language") String language, @RequestParam(value="comment") String comment, ModelMap model) {

		if (language.equals("java")) {
			return "redirect:/java_result";
		}

		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		model.addAttribute("comment", comment);

		return "redirect:/result";
	}

	@RequestMapping(value="/java_result")
	public String java_result() {
		return "java_result.jsp";
	}

	@RequestMapping(value="/result")
	public String result() {
//		HttpSession session = request.getSession();

//		System.out.println("printing name");
//		System.out.println(session.getAttribute("name"));
		return "result.jsp";
	}




}
