package com.dinner.recipes.service;

import com.dinner.recipes.domain.DinnerIdea;
import com.dinner.recipes.repository.DinnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by ola on 07/01/2018.
 */
@Service
public class DbService {
    @Autowired
    private DinnerRepository dinnerRepository;

    public List<DinnerIdea> getAllDinnerIdeas() {
        return dinnerRepository.findAll();
    }

    public Optional<DinnerIdea> getDinnerById(final Long id) {
        return dinnerRepository.findById(id);
    }

    public DinnerIdea saveDinner(final DinnerIdea dinner) {
        return dinnerRepository.save(dinner);
    }

    public void deleteDinner(final Long dinnerId) {
        dinnerRepository.deleteById(dinnerId);
    }
}