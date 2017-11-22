package pl.bgs.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.bgs.entity.GameInstance;
import pl.bgs.repository.GameInstanceRepository;

public class GameInstanceConverter implements Converter<String, GameInstance> {

    @Autowired
    private GameInstanceRepository gameInstanceRepository;
    
    public GameInstance convert(String source) {
    	return gameInstanceRepository.findOne(Long.parseLong(source));
    }
}
