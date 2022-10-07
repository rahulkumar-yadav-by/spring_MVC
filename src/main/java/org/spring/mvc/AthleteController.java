package org.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/athlete")
public class AthleteController {

    @RequestMapping("/showAthleteForm")
    public String showAthlete(Model model){
        model.addAttribute("athlete",new Athlete());
        return "athlete-form";
    }

    @RequestMapping("/showAthleteDetails")
    public String showAthlete(@ModelAttribute("athlete")Athlete myAthlete){
        System.out.println(myAthlete);
        return "athlete-details";
    }


}
