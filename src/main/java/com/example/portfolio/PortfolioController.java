package com.example.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="Shelley Benhoff") String name,
            @RequestParam(name="title", required=false, defaultValue="Developer Relations") String title,
            Model model) {
        model.addAttribute("name", name);
        model.addAttribute("title", title);
        return "index";
    }

}