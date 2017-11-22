package pl.bgs.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.bgs.entity.Player;
import pl.bgs.repository.PlayerRepository;

public class PlayerConverter implements Converter<String, Player> {

    @Autowired
    private PlayerRepository playerRepository;
    
    public Player convert(String source) {
    	return playerRepository.findOne(Long.parseLong(source));
    }
}
