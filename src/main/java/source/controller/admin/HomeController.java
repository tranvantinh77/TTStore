package source.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/admin")
    public String home() {
        return "admin/home";
    }

    @RequestMapping("/patron")
    public String patron() {
        return "admin/patronManagement";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }
}
