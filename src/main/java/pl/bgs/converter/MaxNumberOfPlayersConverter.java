package pl.bgs.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.bgs.entity.MaxNumberOfPlayers;
import pl.bgs.repository.MaxNumberOfPlayersRepository;

public class MaxNumberOfPlayersConverter implements Converter<String, MaxNumberOfPlayers> {

    @Autowired
    private MaxNumberOfPlayersRepository maxNumberOfPlayersRepository;
    
    public MaxNumberOfPlayers convert(String source) {
    	return maxNumberOfPlayersRepository.findOne(Long.parseLong(source));
    }
}
