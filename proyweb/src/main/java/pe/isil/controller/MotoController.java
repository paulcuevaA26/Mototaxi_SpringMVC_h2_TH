package pe.isil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pe.isil.model.Moto;
import pe.isil.service.motoService;

import java.util.List;

@Controller
public class MotoController {

    @Autowired
    motoService motoServices;

    public MotoController(motoService motoService){
        this.motoServices = motoService;
    }

//   Este metodo lista y agrega moto en el HTML manmoto.html
    @GetMapping("/manmoto")
    public String getmanmoto(Model model){
        model.addAttribute("manmotos",motoServices.findAll());
        model.addAttribute("moto", new Moto());
        return "manmoto";

    }

    @PostMapping("/motos/save")
    public String motoSave(Moto moto){
        motoServices.create(moto);
        return "redirect:/manmoto";
    }

    @GetMapping("/manmoto/{numero}")
    public String loanEdit(@PathVariable Long numero, Model model){
        Moto currentMoto = motoServices.findById(numero);
        if (currentMoto != null){
            model.addAttribute("moto1", currentMoto);
        }
        return "manmoto";
    }


}
