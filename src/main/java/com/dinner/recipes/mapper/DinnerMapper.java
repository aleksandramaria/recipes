package com.dinner.recipes.mapper;

import com.dinner.recipes.domain.DinnerIdea;
import com.dinner.recipes.domain.DinnerIdeaDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ola on 07/01/2018.
 */
@Component
public class DinnerMapper {
    public DinnerIdea mapToDinner(final DinnerIdeaDto dinnerIdeaDto) {
        return new DinnerIdea (
                dinnerIdeaDto.getId(),
                dinnerIdeaDto.getName(),
                dinnerIdeaDto.getDescription());
    }

    public DinnerIdeaDto mapToDinnerDto(final DinnerIdea dinnerIdea) {
        return new DinnerIdeaDto(
                dinnerIdea.getId(),
                dinnerIdea.getName(),
                dinnerIdea.getDescription());
    }

    public List<DinnerIdeaDto> mapToDinnerDtoList(final List<DinnerIdea> dinnerList) {
        return dinnerList.stream()
                .map(d -> new DinnerIdeaDto(d.getId(), d.getName(), d.getDescription()))
                .collect(Collectors.toList());
    }
}