package pe.isil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class inicioController {

    @RequestMapping("/paginaprincipal")
    public String index(Model model){
        model.addAttribute("indexs");
        return "index";
    }

    @RequestMapping("/Paraderos")
    public String paradero(Model model){
        model.addAttribute("paraderos");
        return "Paradero";
    }

    @RequestMapping("/contactanoss")
    public String contactanos(Model model){
        model.addAttribute("contactanoss");
        return "contactanos";
    }

    @RequestMapping("/menus")
    public String menu(Model model){
        model.addAttribute("menus");
        return "menu";
    }

    @RequestMapping("/manPrincipal")
    public String menPrincipal(Model model){
        model.addAttribute("mans");
        return "man_principal";
    }




}
