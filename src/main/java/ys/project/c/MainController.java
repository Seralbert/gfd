package ys.project.c;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by User on 21.10.2019.
 *
 */
@Controller
public class MainController {

@RequestMapping("/")
    public String stpage(Model model){
    System.out.println("enter");
    return "main";
}

@RequestMapping("/t")
    public String test(Model model){
        return "test";
}
}
