package pl.bgs.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.bgs.entity.PlayerInGame;
import pl.bgs.repository.PlayerInGameRepository;

public class PlayerInGameConverter implements Converter<String, PlayerInGame>{

    @Autowired
    private PlayerInGameRepository playerInGameRepository;
    
    public PlayerInGame convert(String source) {
    	return playerInGameRepository.findOne(Long.parseLong(source));
    }
}
