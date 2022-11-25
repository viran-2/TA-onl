package webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import webapp.model.Accounts;
import webapp.model.Classrooms;
import webapp.repository.AccountRepo;
import webapp.repository.ClassRepo;

@Controller
public class MainController {

    @Autowired
    private AccountRepo accountRepo;
    @Autowired
    private ClassRepo classRepo;
    
    
    @GetMapping({"/","/home"})
    public ModelAndView getAllClassrooms() {
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("classrooms", classRepo.findAll());
        return mav;
    }
    
    @GetMapping(path = "/createclass")
    public ModelAndView addNewClass(){								
        ModelAndView mav = new ModelAndView("createclass");
        Classrooms classroom = new Classrooms();
        mav.addObject("classroom", classroom);
        return mav;
    }

    @PostMapping("/saveClass")
    public String saveClass(@ModelAttribute Classrooms classroom) {
        classRepo.save(classroom);
        return "redirect:/home";
    }


    
    
    @GetMapping(path = "/register")
    public ModelAndView addNewAccount(){								
        ModelAndView mav = new ModelAndView("register");
        Accounts account = new Accounts();
        mav.addObject("account", account);
        return mav;
    }

    @PostMapping("/saveAccount")
    public String saveAccount(@ModelAttribute Accounts account) {
        accountRepo.save(account);
        return "redirect:/home";
    }
    


}
