package pl.bgs.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.bgs.entity.Game;
import pl.bgs.repository.GameRepository;

public class GameConverter implements Converter<String, Game> {

	@Autowired
	private GameRepository gameRepository;

	public Game convert(String source) {
		return gameRepository.findOne(Long.parseLong(source));
	}
}
