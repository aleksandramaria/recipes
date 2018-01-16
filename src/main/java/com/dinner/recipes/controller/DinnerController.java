package com.dinner.recipes.controller;

import com.dinner.recipes.domain.DinnerIdeaDto;
import com.dinner.recipes.mapper.DinnerMapper;
import com.dinner.recipes.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

/**
 * Created by ola on 07/01/2018.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/dinner")
public class DinnerController {

    @Autowired
    private DinnerMapper dinnerMapper;
    @Autowired
    private DbService dbService;

    @RequestMapping(method = RequestMethod.GET, value = "getDishes")
    public List<DinnerIdeaDto> getDishes() {
        return dinnerMapper.mapToDinnerDtoList(dbService.getAllDinnerIdeas());
    }

    @RequestMapping(method = RequestMethod.GET, value = "getDish")
    public DinnerIdeaDto getDish(@RequestParam Long dishId) throws DishNotFoundException {
        return dinnerMapper.mapToDinnerDto(dbService.getDinnerById(dishId).orElseThrow(DishNotFoundException::new));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteDish")
    public void deleteDish(@RequestParam Long dishId) {
        dbService.deleteDinner(dishId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateDish")
    public DinnerIdeaDto updateDish(@RequestBody DinnerIdeaDto dinnerIdeaDto) {
        return dinnerMapper.mapToDinnerDto(dbService.saveDinner(dinnerMapper.mapToDinner(dinnerIdeaDto)));
    }

    @RequestMapping(method = RequestMethod.POST, value = "createDish", consumes = APPLICATION_JSON_VALUE)
    public void createDish(@RequestBody DinnerIdeaDto dinnerIdeaDto) {
        dbService.saveDinner(dinnerMapper.mapToDinner(dinnerIdeaDto));
    }
}
