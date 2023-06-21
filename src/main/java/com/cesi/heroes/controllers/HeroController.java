package com.cesi.heroes.controllers;

import com.cesi.heroes.domain.Hero;
import com.cesi.heroes.repositories.HeroRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/heroes")
public class HeroController {

    private final HeroRepository heroRepository;

    public HeroController(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    @GetMapping()
    public String getHeroes(Model model) {
        model.addAttribute(heroRepository.findAll());
        return "/heroes";
    }

    @GetMapping("/heroes/create")
    public String createHeroes(Model model) {
        model.addAttribute(heroRepository.findAll());
        return "/heroes/create";
    }

}