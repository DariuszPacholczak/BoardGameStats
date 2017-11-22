package pl.bgs.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.bgs.entity.MaxPlayTime;
import pl.bgs.repository.MaxPlayTimeRepository;

public class MaxPlayTimeConverter implements Converter<String, MaxPlayTime> {

    @Autowired
    private MaxPlayTimeRepository maxPlayTimeRepository;
    
    @Override
    public MaxPlayTime convert(String source) {
    	return maxPlayTimeRepository.findOne(Long.parseLong(source));
    }
}
