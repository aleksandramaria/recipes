package com.dinner.recipes.repository;

import com.dinner.recipes.domain.DinnerIdea;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by ola on 07/01/2018.
 */
public interface DinnerRepository extends CrudRepository<DinnerIdea, Long> {
    @Override
    List<DinnerIdea> findAll();

    @Override
    Optional<DinnerIdea> findById(final Long dinnerId);

    @Override
    DinnerIdea save(DinnerIdea dinner);

    @Override
    void deleteById(final Long dinnerId);
}

//    @Override
//    long count();