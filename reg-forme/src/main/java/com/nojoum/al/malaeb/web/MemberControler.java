package com.nojoum.al.malaeb.web;

import static org.assertj.core.api.Assertions.useDefaultDateFormatsOnly;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nojoum.al.malaeb.dao.CountryRepository;
import com.nojoum.al.malaeb.dao.MemberRepository;
import com.nojoum.al.malaeb.entiies.Country;
import com.nojoum.al.malaeb.entiies.Membre;



@Controller
public class MemberControler {
	@Autowired
	private MemberRepository memberRepository;
	@Autowired
	private CountryRepository countryRepository;
	 @GetMapping("/register")
	    public String membreForm(Model model) {
	        model.addAttribute("membre", new Membre());
	        List<Country> countrys=countryRepository.findAll();
	        model.addAttribute("listcountry", countrys);
	        return "register";
	    }
	 /*
	 @PostMapping("/Confirme")
	    public String Submit(Model model,Membre member) {
		 memberRepository.save(member);
		    
	        return "Confirme";
	    }
	 */
	 @RequestMapping(value="/Confirme",method=org.springframework.web.bind.annotation.RequestMethod.POST )
	 public String submit(Model model ,Membre membre) {
		 membre.setBday(new Date());
		 Country country=new Country();
	Long id = null ;
		 model.addAttribute(id);
		 country=countryRepository.findOne(id);
		 
		 //CountryRepository 
		 //model.addAttribute("country", new Country());
		//membre.setMcoutry(model.g);
		// countryRepository.save(c);
		 membre.setMcoutry(country);
		 memberRepository.save(membre);
		 return "Confirme";
		 
	 }
	 /*
	 @GetMapping("/Membre")
	    public String membr(Model model) {
	        model.addAttribute("membre", new Membre());
	        return "Membre";
	    }
	    */
	
	 /*
	 @PostMapping("/Membre")
	    public String membreSubmit(Model model,Membre membre) {
		 memberRepository.saveAndFlush(membre);
		    
	        return "Membre";
	    }
    	*/
    }
