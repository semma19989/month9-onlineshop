package kg.attractor.onlineshop.product;


import kg.attractor.onlineshop.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class MainController {

    @Autowired
    BrandRepository br;

    @Autowired
    UserRepository ur;

    @Autowired
    CategoryRepository cr;

    @RequestMapping("/")
    public String mainPage(Model model){
        model.addAttribute("brands",br.findAll());
        model.addAttribute("categories",cr.findAll());
        return "index";
    }

    @RequestMapping("/{name}")
    public String mainPage1(Model model, @PathVariable("name") String name){
        model.addAttribute("brands", br.getByName(name));
        model.addAttribute("categories",cr.getByName(name));
        return "index";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }
}