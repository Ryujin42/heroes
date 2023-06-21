package com.cesi.heroes.services;

import com.cesi.heroes.domain.Hero;
import com.cesi.heroes.repositories.HeroRepository;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

public class HeroServiceImpl implements HeroService {

    private final HeroRepository heroRepository;

    public HeroServiceImpl(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    @Override
    public List<Hero> findAll() {
        return (List<Hero>) heroRepository.findAll();
    }

    @Override
    public Hero findById(Long id) {
        return heroRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Hero hero) {
        heroRepository.save(hero);
    }

    @Override
    public void delete(Long id) {
        heroRepository.delete(findById(id));
    }
}
