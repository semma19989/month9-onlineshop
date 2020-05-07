package kg.attractor.onlineshop.product;


import kg.attractor.onlineshop.user.UserRepository;
import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.User;
import org.apache.catalina.UserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Iterator;

@Controller
public class RestController {
    @Autowired


    BrandRepository br;

    @Autowired
    CategoryRepository cr;

    @Autowired
    UserRepository ur;


    @GetMapping("/registration")
    public String registrationPage(Model model){
        if (!model.containsAttribute("form")) {
            model.addAttribute("form", new User() {
                @Override
                public boolean equals(Object another) {
                    return false;
                }

                @Override
                public String toString() {
                    return null;
                }

                @Override
                public int hashCode() {
                    return 0;
                }

                @Override
                public String getName() {
                    return null;
                }

                @Override
                public String getFullName() {
                    return null;
                }

                @Override
                public void setFullName(String s) {

                }

                @Override
                public Iterator<Group> getGroups() {
                    return null;
                }

                @Override
                public String getPassword() {
                    return null;
                }

                @Override
                public void setPassword(String s) {

                }

                @Override
                public Iterator<Role> getRoles() {
                    return null;
                }

                @Override
                public UserDatabase getUserDatabase() {
                    return null;
                }

                @Override
                public String getUsername() {
                    return null;
                }

                @Override
                public void setUsername(String s) {

                }

                @Override
                public void addGroup(Group group) {

                }

                @Override
                public void addRole(Role role) {

                }

                @Override
                public boolean isInGroup(Group group) {
                    return false;
                }

                @Override
                public boolean isInRole(Role role) {
                    return false;
                }

                @Override
                public void removeGroup(Group group) {

                }

                @Override
                public void removeGroups() {

                }

                @Override
                public void removeRole(Role role) {

                }

                @Override
                public void removeRoles() {

                }
            });
        }

        return "registration";
    }

    @PostMapping("/registration")
    public String createUser(@Valid User user, BindingResult br, RedirectAttributes ra
    ) {
        ra.addFlashAttribute("form", user);
        if (br.hasFieldErrors()){
            ra.addFlashAttribute("errors",br.getFieldErrors());
            return "redirect:/registration";
        }else {
            System.out.println(user);
            ur.save(user);
            return "redirect:/";
        }
    }

}
