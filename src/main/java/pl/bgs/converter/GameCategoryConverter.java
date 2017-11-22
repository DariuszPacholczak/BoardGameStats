package pl.bgs.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.bgs.entity.GameCategory;
import pl.bgs.repository.GameCategoryRepository;

public class GameCategoryConverter implements Converter<String, GameCategory>{

    @Autowired
    private GameCategoryRepository gameCategoryRepository;
    
    public GameCategory convert(String source) {
    	return gameCategoryRepository.findOne(Long.parseLong(source));
    }
}
